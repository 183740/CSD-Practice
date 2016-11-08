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
        String romanNumeral="";

        if(i==0) return romanNumeral;

        if(i>=1 && i<4)
        {
            romanNumeral = "I" + getUnit(i-1);
        }else if(i==4)
        {
            romanNumeral = "IV";
        }else if(i==5)
        {
            romanNumeral = "V";
        }else if(i==6)
        {
            romanNumeral = "VI";
        }
        return romanNumeral;
    }
}
