package com.csd.Test;

import com.csd.hundreddoors.HundredDoors;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuefen on 2016/11/1.
 */
public class HundredDoorsTest {
    @Before
    public void before()
    {

    }

    @Test public void GIVEN_1_door_WHEN_ask_open_door_THEN_get_1()
    {
        HundredDoors hundredDoors = new HundredDoors(1);
        assertEquals(Arrays.asList(1),hundredDoors.getOpenDoors());
    }

    @Test public void GIVEN_1_door_WHEN_ask_close_door_THEN_get_0()
    {
        HundredDoors hundredDoors = new HundredDoors(1);
        assertEquals(Arrays.asList(),hundredDoors.getCloseDoors());
    }

    @Test public void GIVEN_2_door_WHEN_ask_open_door_THEN_get_1()
    {
        HundredDoors hundredDoors = new HundredDoors(2);
        assertEquals(Arrays.asList(1),hundredDoors.getOpenDoors());
    }
    @Test public void GIVEN_2_door_WHEN_ask_close_door_THEN_get_2()
    {
        HundredDoors hundredDoors = new HundredDoors(2);
        assertEquals(Arrays.asList(2),hundredDoors.getCloseDoors());
    }

    @Test public void GIVEN_3_door_WHEN_ask_open_door_THEN_get_1()
    {
        HundredDoors hundredDoors = new HundredDoors(3);
        assertEquals(Arrays.asList(1),hundredDoors.getOpenDoors());
    }

    @Test public void GIVEN_3_door_WHEN_ask_close_door_THEN_get_23()
    {
        HundredDoors hundredDoors = new HundredDoors(3);
        assertEquals(Arrays.asList(2,3),hundredDoors.getCloseDoors());
    }

    @Test public void GIVEN_4_door_WHEN_ask_open_door_THEN_get_14()
    {
        HundredDoors hundredDoors = new HundredDoors(4);
        assertEquals(Arrays.asList(1,4),hundredDoors.getOpenDoors());
    }

    @Test public void GIVEN_4_door_WHEN_ask_close_door_THEN_get_23()
    {
        HundredDoors hundredDoors = new HundredDoors(4);
        assertEquals(Arrays.asList(2,3),hundredDoors.getCloseDoors());
    }

    @After public void After()
    {

    }
}
