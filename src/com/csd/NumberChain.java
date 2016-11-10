package com.csd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuefen on 2016/11/9.
 */
public class NumberChain {

    public static final int SORT_MODE_DESCENDIND = 1;
    public static final int SORT_MODE_ASCENDING = 2;
    private String numStrOriginal = "";
    private String numStrDescending = "";
    private String numStrAscending = "";
    private ArrayList<Integer> results;
    private int chainCount;

    private int[] originalNumber;

    public NumberChain(String number)
    {
        this.results = new ArrayList<Integer>();
        this.chainCount = 0;

        startChainCalc(number);
        System.out.println("Chain: " + this.getChain()); System.out.println("");
    }

    private void startChainCalc(String number) {
        prepareForChainCalc(number);

        int result = this.getCalcResult();
        System.out.println(this.getDescendingStr() + " - " + this.getAscendingStr() + " = " + String.valueOf(result));
        this.chainCount++;

        if(!isExist(result))
        {
            this.results.add(result);
            startChainCalc(String.valueOf(result));
        }
    }

    private boolean isExist(int result) {
        for(int i=0;i<this.results.size();i++)
        {
            if(this.results.get(i) == result)
            {
                return true;
            }
        }
        return false;
    }

    private void prepareForChainCalc(String number) {
        originalNumber = prepareIntArrays(number);

        sorting(SORT_MODE_DESCENDIND);
        numStrDescending = intArrayToString();

        sorting(SORT_MODE_ASCENDING);
        numStrAscending = intArrayToString();
    }

    private int[] prepareIntArrays(String number) {
        int[] originalNumber = new int[number.length()];
        for(int i = 0; i<number.length(); i++)
        {
            originalNumber[i] = Integer.parseInt(number.substring(i,i+1));
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
                if (sortMode==SORT_MODE_DESCENDIND && (originalNumber[j + 1] > originalNumber[j]) || sortMode==SORT_MODE_ASCENDING && (originalNumber[j + 1] < originalNumber[j]))
                {
                    temp = originalNumber[j];
                    originalNumber[j] = originalNumber[j + 1];
                    originalNumber[j + 1] = temp;
                }
            }
        }
    }

    public int getCalcResult() {
        return Integer.parseInt(this.getDescendingStr()) - Integer.parseInt(this.getAscendingStr());
    }

    public int getChain() {
        return this.chainCount;
    }
}