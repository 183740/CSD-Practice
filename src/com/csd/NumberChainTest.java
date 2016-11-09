package com.csd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuefen on 2016/11/9.
 */
public class NumberChainTest {

    @Test public void GIVEN_String_12_WHEN_Sorting_THEN_get_21()
    {
        NumberChain numberChain = new NumberChain("12");
        assertEquals("21", numberChain.getDescendingStr());
        assertEquals("12", numberChain.getAscendingStr());
    }

    @Test public void GIVEN_String_123_WHEN_Sorting_THEN_get_321()
    {
        NumberChain numberChain = new NumberChain("213");
        assertEquals("321", numberChain.getDescendingStr());
        assertEquals("123", numberChain.getAscendingStr());
    }
}
