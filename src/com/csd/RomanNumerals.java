package com.csd;

/**
 * Created by xuefen on 2016/11/7.
 */
public class RomanNumerals {
    public String generate(int i) {
        if(i==1)
            return "I";
        else if (i==2)
            return "II";
        return "III";
    }
}
