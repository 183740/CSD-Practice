package com.csd;

/**
 * Created by xuefen on 2016/11/7.
 */
public class RomanNumerals {
    public String generate(int i) {
        String romanNumeral = "";

        romanNumeral = getTens((i%100)/10) + getUnits(i%10);

        return romanNumeral;
    }

    private String getTens(int i) {
        if(i==0) return "";
        return "X";
    }

    private String getUnits(int i) {
        if(i<=0) return "";

        if(i>=1 && i<=3)
        {
            return("I" + getUnits(i-1));
        }

        if(i==9)
        {
            return "IX";
        }

        int diff = i-5;
        return(getUnits(0-diff) + "V" + getUnits(diff));
    }
}