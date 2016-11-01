package com.csd.Test;

import com.csd.hundreddoors.HundredDoors;
import com.csd.hundreddoors.HundredDoorsA;
import com.csd.hundreddoors.HundredDoorsB;
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
        HundredDoors hundredDoorsA = new HundredDoorsA(1);
        assertEquals(Arrays.asList(1),hundredDoorsA.getOpenDoors());

        HundredDoors hundredDoorsB = new HundredDoorsB(1);
        assertEquals(Arrays.asList(1),hundredDoorsB.getOpenDoors());
    }

    @Test public void GIVEN_1_door_WHEN_ask_close_door_THEN_get_0()
    {
        HundredDoors hundredDoorsA = new HundredDoorsA(1);
        assertEquals(Arrays.asList(),hundredDoorsA.getCloseDoors());

        HundredDoors hundredDoorsB = new HundredDoorsB(1);
        assertEquals(Arrays.asList(),hundredDoorsB.getCloseDoors());
    }

    @Test public void GIVEN_2_door_WHEN_ask_open_door_THEN_get_1()
    {
        HundredDoors hundredDoorsA = new HundredDoorsA(2);
        assertEquals(Arrays.asList(1),hundredDoorsA.getOpenDoors());

        HundredDoors hundredDoorsB = new HundredDoorsB(2);
        assertEquals(Arrays.asList(1),hundredDoorsB.getOpenDoors());
    }
    @Test public void GIVEN_2_door_WHEN_ask_close_door_THEN_get_2()
    {
        HundredDoors hundredDoorsA = new HundredDoorsA(2);
        assertEquals(Arrays.asList(2),hundredDoorsA.getCloseDoors());

        HundredDoors hundredDoorsB = new HundredDoorsB(2);
        assertEquals(Arrays.asList(2),hundredDoorsB.getCloseDoors());
    }

    @Test public void GIVEN_3_door_WHEN_ask_open_door_THEN_get_1()
    {
        HundredDoors hundredDoorsA = new HundredDoorsA(3);
        assertEquals(Arrays.asList(1),hundredDoorsA.getOpenDoors());

        HundredDoors hundredDoorsB = new HundredDoorsB(3);
        assertEquals(Arrays.asList(1),hundredDoorsB.getOpenDoors());
    }

    @Test public void GIVEN_3_door_WHEN_ask_close_door_THEN_get_23()
    {
        HundredDoors hundredDoorsA = new HundredDoorsA(3);
        assertEquals(Arrays.asList(2,3),hundredDoorsA.getCloseDoors());

        HundredDoors hundredDoorsB = new HundredDoorsB(3);
        assertEquals(Arrays.asList(2,3),hundredDoorsB.getCloseDoors());
    }

    @Test public void GIVEN_4_door_WHEN_ask_open_door_THEN_get_14()
    {
        HundredDoors hundredDoorsA = new HundredDoorsA(4);
        assertEquals(Arrays.asList(1,4),hundredDoorsA.getOpenDoors());

        HundredDoors hundredDoorsB = new HundredDoorsB(4);
        assertEquals(Arrays.asList(1,4),hundredDoorsB.getOpenDoors());
    }

    @Test public void GIVEN_4_door_WHEN_ask_close_door_THEN_get_23()
    {
        HundredDoors hundredDoorsA = new HundredDoorsA(4);
        assertEquals(Arrays.asList(2,3),hundredDoorsA.getCloseDoors());

        HundredDoors hundredDoorsB = new HundredDoorsB(4);
        assertEquals(Arrays.asList(2,3),hundredDoorsB.getCloseDoors());
    }

    @After public void After()
    {

    }
}