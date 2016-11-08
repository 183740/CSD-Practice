package com.csd;

/**
 * Created by xuefen on 2016/11/7.
 */
public class RomanNumerals {
    private String minUnit[] = new String[]{"","I","X","C","M"};
    private String baseUnit[] = new String[]{"","V","L","D",""};

    public String convertToRomanNumerals(int i) {
        String romanNumeral = "";
        String numberString = String.valueOf(i);

        if(i<1 || i>4999)
        {
            return "NA";
        }

        if(numberString.length()==1) {
            return getUnits(i,1);
        }

        return getUnits((int)(i/Math.pow(10,numberString.length()-1)),numberString.length()) + convertToRomanNumerals((int) (i%Math.pow(10,numberString.length()-1)));
    }

    private String getUnits(int i,int digitPos) {
        if(i<=0) return "";

        if(i>=1 && i<=3 || digitPos == 4){
            return(this.minUnit[digitPos] + getUnits(i-1,digitPos));
        }

        if(i==9){
            return this.minUnit[digitPos] + this.minUnit[digitPos+1];
        }

        return(getUnits(5-i,digitPos) + this.baseUnit[digitPos] + getUnits(i-5,digitPos));
    }
}