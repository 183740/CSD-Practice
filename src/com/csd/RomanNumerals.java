package com.csd;

/**
 * Created by xuefen on 2016/11/7.
 */
public class RomanNumerals {
    public static final int INT_DIGIT_BASE_VALUE = 5;
    public static final int INT_ROMAN_MAX_VALUE = 4999;
    public static final int INT_DIGIT_MIN_VALUE = 1;
    public static final int INT_DIGIT_MAX_VALUE = 9;
    private String minUnit[] = new String[]{"","I","X","C","M"};
    private String baseUnit[] = new String[]{"","V","L","D",""};

    public String convertToRomanNumerals(int number) {
        if(number< INT_DIGIT_MIN_VALUE || number> INT_ROMAN_MAX_VALUE) {
            return "";
        }

        if(String.valueOf(number).length()==1) {
            return getUnits(number,1);
        }

        return getUnits(getBiggestDigit(number),String.valueOf(number).length()) + convertToRomanNumerals(getRemainingDigit(number));
    }

    private int getRemainingDigit(int number) {
        return (int) (number%Math.pow(10,String.valueOf(number).length()-1));
    }

    private int getBiggestDigit(int number) {
        return (int)(number/Math.pow(10,String.valueOf(number).length()-1));
    }

    private String getUnits(int digitValue,int digitPos) {
        if(digitValue<1) return "";

        if(digitValue>= INT_DIGIT_MIN_VALUE && digitValue<=3 || digitPos == 4){
            return(this.minUnit[digitPos] + getUnits(digitValue-1,digitPos));
        }

        if(digitValue== INT_DIGIT_MAX_VALUE){
            return getUnits(INT_DIGIT_MIN_VALUE,digitPos) + getUnits(INT_DIGIT_MIN_VALUE,digitPos+1);
        }

        return(getUnits(INT_DIGIT_BASE_VALUE -digitValue,digitPos) + this.baseUnit[digitPos] + getUnits(digitValue- INT_DIGIT_BASE_VALUE,digitPos));
    }
}