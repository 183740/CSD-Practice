package com.csd;

/**
 * Created by xuefen on 2016/11/9.
 */
public class NumberChain {

    public String getDescending(String s)
    {
        int[] originalNumber = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            originalNumber[i] = Integer.parseInt(s.substring(i,i+1));
        }

        int temp = 0;
        for (int i = originalNumber.length - 1; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (originalNumber[j + 1] > originalNumber[j])
                {
                    temp = originalNumber[j];
                    originalNumber[j] = originalNumber[j + 1];
                    originalNumber[j + 1] = temp;
                }
            }
        }

        String descendingString = "";
        for(int i=0;i<originalNumber.length;i++)
        {
            descendingString+= originalNumber[i];
        }
        return descendingString;
    }

    public String getAscending(String s) {
        int[] originalNumber = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            originalNumber[i] = Integer.parseInt(s.substring(i,i+1));
        }

        int temp = 0;
        for (int i = originalNumber.length - 1; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (originalNumber[j + 1] < originalNumber[j])
                {
                    temp = originalNumber[j];
                    originalNumber[j] = originalNumber[j + 1];
                    originalNumber[j + 1] = temp;
                }
            }
        }

        String aescendingString = "";
        for(int i=0;i<originalNumber.length;i++)
        {
            aescendingString+= originalNumber[i];
        }
        return aescendingString;
    }
}
