package sample;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuefen on 2016/10/31.
 */
public class HundredDoorsTest {

    @Before
    public void Before()
    {

    }

    @Test
    public void GIVEN_1_Door_RETURN_1_FOR_OPEN()
    {
        HundredDoors hundredDoors = new HundredDoors(1);
        assertEquals(Arrays.asList(1),hundredDoors.getOpenDoors());
        assertEquals(Arrays.asList(),hundredDoors.getCloseDoors());
    }

    @Test public void GIVEN_2_Door_RETURN_1_FOR_OPEN_2_FOR_CLOSE()
    {

        HundredDoors hundredDoors = new HundredDoors(2);
        assertEquals(Arrays.asList(1),hundredDoors.getOpenDoors());
        assertEquals(Arrays.asList(2),hundredDoors.getCloseDoors());
    }

    @After
    public void After()
    {

    }
}