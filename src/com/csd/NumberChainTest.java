package com.csd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuefen on 2016/11/9.
 */
public class NumberChainTest {

    @Test public void GIVEN_String_12_WHEN_Reserse_THEN_get_21()
    {
        NumberChain numberChain = new NumberChain();
        assertEquals("21", numberChain.getReverse("12"));

    }
}
