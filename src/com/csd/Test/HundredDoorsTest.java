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

    @Test public void GIVEN_invalid_doors_WHEN_ask_open_door_THEN_get_null()
    {
        try
        {
            int numberOfDoors = -23;
            HundredDoors hundredDoorsA = new HundredDoorsA(numberOfDoors);
            //assertEquals(Arrays.asList(),hundredDoorsA.getOpenDoors());

            HundredDoors hundredDoorsB = new HundredDoorsB(numberOfDoors);
            //assertEquals(Arrays.asList(),hundredDoorsB.getOpenDoors());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test public void GIVEN_1_door_WHEN_ask_open_door_THEN_get_1()
    {
        try
        {
            HundredDoors hundredDoorsA = new HundredDoorsA(1);
            assertEquals(Arrays.asList(1),hundredDoorsA.getOpenDoors());

            HundredDoors hundredDoorsB = new HundredDoorsB(1);
            assertEquals(Arrays.asList(1),hundredDoorsB.getOpenDoors());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test public void GIVEN_1_door_WHEN_ask_close_door_THEN_get_0()
    {
        try
        {
            HundredDoors hundredDoorsA = new HundredDoorsA(1);
            assertEquals(Arrays.asList(),hundredDoorsA.getCloseDoors());

            HundredDoors hundredDoorsB = new HundredDoorsB(1);
            assertEquals(Arrays.asList(),hundredDoorsB.getCloseDoors());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test public void GIVEN_2_door_WHEN_ask_open_door_THEN_get_1()
    {
        try
        {
            HundredDoors hundredDoorsA = new HundredDoorsA(2);
            assertEquals(Arrays.asList(1),hundredDoorsA.getOpenDoors());

            HundredDoors hundredDoorsB = new HundredDoorsB(2);
            assertEquals(Arrays.asList(1),hundredDoorsB.getOpenDoors());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test public void GIVEN_2_door_WHEN_ask_close_door_THEN_get_2()
    {
        try
        {
            HundredDoors hundredDoorsA = new HundredDoorsA(2);
            assertEquals(Arrays.asList(2),hundredDoorsA.getCloseDoors());

            HundredDoors hundredDoorsB = new HundredDoorsB(2);
            assertEquals(Arrays.asList(2),hundredDoorsB.getCloseDoors());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test public void GIVEN_3_door_WHEN_ask_open_door_THEN_get_1()
    {
        try
        {
            HundredDoors hundredDoorsA = new HundredDoorsA(3);
            assertEquals(Arrays.asList(1),hundredDoorsA.getOpenDoors());

            HundredDoors hundredDoorsB = new HundredDoorsB(3);
            assertEquals(Arrays.asList(1),hundredDoorsB.getOpenDoors());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test public void GIVEN_3_door_WHEN_ask_close_door_THEN_get_23()
    {
        try
        {
            HundredDoors hundredDoorsA = new HundredDoorsA(3);
            assertEquals(Arrays.asList(2,3),hundredDoorsA.getCloseDoors());

            HundredDoors hundredDoorsB = new HundredDoorsB(3);
            assertEquals(Arrays.asList(2,3),hundredDoorsB.getCloseDoors());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test public void GIVEN_4_door_WHEN_ask_open_door_THEN_get_14()
    {
        try
        {
            HundredDoors hundredDoorsA = new HundredDoorsA(4);
            assertEquals(Arrays.asList(1,4),hundredDoorsA.getOpenDoors());

            HundredDoors hundredDoorsB = new HundredDoorsB(4);
            assertEquals(Arrays.asList(1,4),hundredDoorsB.getOpenDoors());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test public void GIVEN_4_door_WHEN_ask_close_door_THEN_get_23()
    {
        try
        {
            HundredDoors hundredDoorsA = new HundredDoorsA(4);
            assertEquals(Arrays.asList(2,3),hundredDoorsA.getCloseDoors());

            HundredDoors hundredDoorsB = new HundredDoorsB(4);
            assertEquals(Arrays.asList(2,3),hundredDoorsB.getCloseDoors());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test public void GIVEN_same_doors_WHEN_2_algorithm_THEN_get_same_results()
    {
        for(int i = 1;i<=100;i++)
        {
            try
            {
                HundredDoorsA hundredDoorsA = new HundredDoorsA(i);
                HundredDoorsB hundredDoorsB = new HundredDoorsB(i);
                HundredDoors hundredDoors = new HundredDoors(i);
                assertEquals(hundredDoorsA.getOpenDoors(), hundredDoorsB.getOpenDoors());
                assertEquals(hundredDoorsA.getCloseDoors(), hundredDoorsB.getCloseDoors());
                System.out.println(String.valueOf(i) + " Doors  " + hundredDoorsA.getTotalCheckingCount() + "  " + hundredDoorsB.getTotalCheckingCount());
            } catch (Exception e) {
            e.printStackTrace();
            }
        }
    }

    @Test public void GIVEN_same_doors_WHEN_B_C_algorithm_THEN_get_same_results()
    {
        for(int i = 1;i<=100;i++)
        {
            try
            {
                HundredDoorsB hundredDoorsB = new HundredDoorsB(i);
                HundredDoors hundredDoors = HundredDoors.getHundredDoors(i);
                assertEquals(hundredDoorsB.getOpenDoors(), hundredDoors.getOpenDoors());
                assertEquals(hundredDoorsB.getCloseDoors(), hundredDoors.getCloseDoors());
                System.out.println(String.valueOf(i) + " Doors  " + hundredDoorsB.getTotalCheckingCount() + "  " + hundredDoors.getTotalCheckingCount());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test public void GIVEN_same_doors_WHEN_A_C_algorithm_THEN_get_same_results()
    {
        for(int i = 1;i<=100;i++)
        {
            try
            {
                HundredDoors hundredDoorsA = new HundredDoorsA(i);
                HundredDoors hundredDoors = HundredDoors.getHundredDoors(i);
                assertEquals(hundredDoorsA.getOpenDoors(), hundredDoors.getOpenDoors());
                assertEquals(hundredDoorsA.getCloseDoors(), hundredDoors.getCloseDoors());
                System.out.println(String.valueOf(i) + " Doors  " + hundredDoorsA.getTotalCheckingCount() + "  " + hundredDoors.getTotalCheckingCount());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @After public void After()
    {

    }
}