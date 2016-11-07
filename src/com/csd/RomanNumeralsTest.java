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
}
