package com.csd.Test;

import com.csd.hundreddoors.HundredDoors;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuefen on 2016/11/1.
 */
public class HundredDoorsTest {
    @Before
    public void before()
    {

    }

    @Test
    public void GIVEN_1_door_WHEN_ask_open_door_THEN_get_1()
    {
        HundredDoors hundredDoors = new HundredDoors(1);
        assertEquals(1,hundredDoors.getOpenDoors());
    }

    @After
    public void After()
    {

    }
}
