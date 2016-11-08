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
        assertEquals("I",romanNumerals.generate(1));
    }

    @Test public void GIVEN_Roman_WHEN_give_2_THEN_return_II()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("II",romanNumerals.generate(2));
    }

    @Test public void GIVEN_Roman_WHEN_give_3_THEN_return_III()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("III",romanNumerals.generate(3));
    }

    @Test public void GIVEN_Roman_WHEN_give_4_THEN_return_IV()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("IV",romanNumerals.generate(4));
    }

    @Test public void GIVEN_Roman_WHEN_give_5_THEN_return_V()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("V",romanNumerals.generate(5));
    }

    @Test public void GIVEN_Roman_WHEN_give_6_THEN_return_VI()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VI",romanNumerals.generate(6));
    }

    @Test public void GIVEN_Roman_WHEN_give_7_THEN_return_VII()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VII",romanNumerals.generate(7));
    }

    @Test public void GIVEN_Roman_WHEN_give_8_THEN_return_VIII()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VIII",romanNumerals.generate(8));
    }

    @Test public void GIVEN_Roman_WHEN_give_9_THEN_return_IX()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("IX",romanNumerals.generate(9));
    }

    @Test public void GIVEN_Roman_WHEN_give_10_THEN_return_X()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("X",romanNumerals.generate(10));
    }

    @Test public void GIVEN_Roman_WHEN_give_11_THEN_return_XI()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XI",romanNumerals.generate(11));
    }

    @Test public void GIVEN_Roman_WHEN_give_12_THEN_return_XII()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XII",romanNumerals.generate(12));
    }

    @Test public void GIVEN_Roman_WHEN_give_13_THEN_return_XIII()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XIII",romanNumerals.generate(13));
    }

    @Test public void GIVEN_Roman_WHEN_give_19_THEN_return_XIX()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("XIX",romanNumerals.generate(19));
    }
}
