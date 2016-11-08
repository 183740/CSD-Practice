package com.csd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuefen on 2016/11/7.
 */
public class RomanNumeralsTest {
    @Test public void GIVEN_Roman_WHEN_give_1_THEN_return_I()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I",romanNumerals.convertToRomanNumerals(1));
    }

    @Test public void GIVEN_Roman_WHEN_give_2_THEN_return_II()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("II",romanNumerals.convertToRomanNumerals(2));
    }

    @Test public void GIVEN_Roman_WHEN_give_3_THEN_return_III()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("III",romanNumerals.convertToRomanNumerals(3));
    }

    @Test public void GIVEN_Roman_WHEN_give_4_THEN_return_IV()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("IV",romanNumerals.convertToRomanNumerals(4));
    }

    @Test public void GIVEN_Roman_WHEN_give_5_THEN_return_V()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("V",romanNumerals.convertToRomanNumerals(5));
    }

    @Test public void GIVEN_Roman_WHEN_give_6_THEN_return_VI()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VI",romanNumerals.convertToRomanNumerals(6));
    }

    @Test public void GIVEN_Roman_WHEN_give_7_THEN_return_VII()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VII",romanNumerals.convertToRomanNumerals(7));
    }

    @Test public void GIVEN_Roman_WHEN_give_8_THEN_return_VIII()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VIII",romanNumerals.convertToRomanNumerals(8));
    }

    @Test public void GIVEN_Roman_WHEN_give_9_THEN_return_IX()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("IX",romanNumerals.convertToRomanNumerals(9));
    }

    @Test public void GIVEN_Roman_WHEN_give_10_THEN_return_X()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("X",romanNumerals.convertToRomanNumerals(10));
    }

    @Test public void GIVEN_Roman_WHEN_give_11_THEN_return_XI()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XI",romanNumerals.convertToRomanNumerals(11));
    }

    @Test public void GIVEN_Roman_WHEN_give_12_THEN_return_XII()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XII",romanNumerals.convertToRomanNumerals(12));
    }

    @Test public void GIVEN_Roman_WHEN_give_13_THEN_return_XIII()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XIII",romanNumerals.convertToRomanNumerals(13));
    }

    @Test public void GIVEN_Roman_WHEN_give_19_THEN_return_XIX()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XIX",romanNumerals.convertToRomanNumerals(19));
    }

    @Test public void GIVEN_Roman_WHEN_give_20_THEN_return_XX()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XX",romanNumerals.convertToRomanNumerals(20));
    }

    @Test public void GIVEN_Roman_WHEN_give_21_THEN_return_XXI()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XXI",romanNumerals.convertToRomanNumerals(21));
    }

    @Test public void GIVEN_Roman_WHEN_give_29_THEN_return_XXIX()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XXIX",romanNumerals.convertToRomanNumerals(29));
    }

    @Test public void GIVEN_Roman_WHEN_give_30_THEN_return_XXX()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XXX",romanNumerals.convertToRomanNumerals(30));
    }

    @Test public void GIVEN_Roman_WHEN_give_99_THEN_return_XCIX()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XCIX",romanNumerals.convertToRomanNumerals(99));
    }

    @Test public void GIVEN_Roman_WHEN_give_100_THEN_return_C()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("C",romanNumerals.convertToRomanNumerals(100));
    }

    @Test public void GIVEN_Roman_WHEN_give_999_THEN_return_CMXCIX()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("CMXCIX",romanNumerals.convertToRomanNumerals(999));
    }
}