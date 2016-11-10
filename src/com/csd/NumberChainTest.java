package com.csd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuefen on 2016/11/9.
 */
public class NumberChainTest {

    /*
    @Test public void GIVEN_String_914236758_WHEN_Descending_THEN_get_987654321()
    {
        NumberChain numberChain = new NumberChain("914236758");
        assertEquals("987654321", numberChain.getDescendingStr());
    }

    @Test public void GIVEN_String_914236758_WHEN_Ascending_THEN_get_123456789()
    {
        NumberChain numberChain = new NumberChain("914236758");
        assertEquals("123456789", numberChain.getAscendingStr());
    }

    @Test public void GIVEN_String_123_WHEN_Descending_THEN_get_321()
    {
        NumberChain numberChain = new NumberChain("213");
        assertEquals("321", numberChain.getDescendingStr());
    }

    @Test public void GIVEN_String_123_WHEN_Ascending_THEN_get_123()
    {
        NumberChain numberChain = new NumberChain("213");
        assertEquals("123", numberChain.getAscendingStr());
    }

    @Test public void GIVEN_String_123_WHEN_ask_result_THEN_get_198()
    {
        NumberChain numberChain = new NumberChain("213");
        assertEquals(198, numberChain.getCalcResult());
    }
*/

    @Test public void GIVEN_String_123456789_WHEN_ask_chain_THEN_get_2()
    {
        NumberChain numberChain = new NumberChain("123456789");
        assertEquals(2, numberChain.getChain());
    }

    @Test public void GIVEN_String_2314_WHEN_ask_chain_THEN_get_4()
    {
        NumberChain numberChain = new NumberChain("2314");
        assertEquals(4, numberChain.getChain());
    }
}
