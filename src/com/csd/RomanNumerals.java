package com.csd;

/**
 * Created by xuefen on 2016/11/7.
 */
public class RomanNumerals {
    public String generate(int i) {
        String romanNumeral = "";
        romanNumeral = getUnit(i);
        return romanNumeral;
    }

    private String getUnit(int i) {
        if(i<=0) return "";

        if(i>=1 && i<=3)
        {
            return("I" + getUnit(i-1));
        }

        if(i==9)
        {
            return "IX";
        }

        int diff = i-5;
        return(getUnit(0-diff) + "V" + getUnit(diff));
    }
}