package com.csd;

/**
 * Created by xuefen on 2016/11/9.
 */
public class NumberChain {

    public static final int SORT_MODE_DESCENDIND = 1;
    public static final int SORT_MODEASCENDING = 2;
    private String numStrOriginal = "";
    private String numStrDescending = "";
    private String numStrAscending = "";

    private int[] originalNumber;

    public NumberChain(String number)
    {
        this.numStrOriginal = number;
        originalNumber = prepareIntArrays();

        sorting(SORT_MODE_DESCENDIND);
        numStrDescending = intArrayToString();

        sorting(SORT_MODEASCENDING);
        numStrAscending = intArrayToString();
    }

    private int[] prepareIntArrays() {
        int[] originalNumber = new int[this.numStrOriginal.length()];
        for(int i = 0; i<this.numStrOriginal.length(); i++)
        {
            originalNumber[i] = Integer.parseInt(this.numStrOriginal.substring(i,i+1));
        }
        return originalNumber;
    }

    public String getDescendingStr()
    {
        return numStrDescending;
    }

    public String getAscendingStr() {
        return numStrAscending;
    }

    private String intArrayToString() {
        String descendingString = "";
        for(int i=0;i<originalNumber.length;i++)
        {
            descendingString+= originalNumber[i];
        }
        return descendingString;
    }

    private void sorting(int sortMode) {
        int temp = 0;
        for (int i = originalNumber.length - 1; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (sortMode==1 && (originalNumber[j + 1] > originalNumber[j]) || sortMode==2 && (originalNumber[j + 1] < originalNumber[j]))
                {
                    temp = originalNumber[j];
                    originalNumber[j] = originalNumber[j + 1];
                    originalNumber[j + 1] = temp;
                }
            }
        }
    }
}