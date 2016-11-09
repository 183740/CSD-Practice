package com.csd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuefen on 2016/11/9.
 */
public class NumberChainTest {

    @Test public void GIVEN_String_12_WHEN_Descende_THEN_get_21()
    {
        NumberChain numberChain = new NumberChain();
        assertEquals("21", numberChain.getDescending("12"));
        assertEquals("12", numberChain.getAscending("21"));
    }

    @Test public void GIVEN_String_123_WHEN_Descende_THEN_get_321()
    {
        NumberChain numberChain = new NumberChain();
        assertEquals("321", numberChain.getDescending("123"));
        assertEquals("123", numberChain.getAscending("321"));
    }
}
