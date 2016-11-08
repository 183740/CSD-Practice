package com.csd;

/**
 * Created by xuefen on 2016/11/7.
 */
public class RomanNumerals {
    private String minUnit[] = new String[]{"","I","X","C","M"};
    private String baseUnit[] = new String[]{"","V","L","D",""};

    public String convertToRomanNumerals(int i) {
        String romanNumeral = "";
        romanNumeral = getUnits((i%1000)/100,3) + getUnits((i%100)/10,2) + getUnits(i%10,1);
        return romanNumeral;
    }

    private String getUnits(int i,int digitPos) {
        if(i<=0) return "";

        if(i>=1 && i<=3){
            return(this.minUnit[digitPos] + getUnits(i-1,digitPos));
        }

        if(i==9){
            return this.minUnit[digitPos] + this.minUnit[digitPos+1];
        }

        int diff = i-5;
        return(getUnits(0-diff,digitPos) + this.baseUnit[digitPos] + getUnits(diff,digitPos));
    }
}