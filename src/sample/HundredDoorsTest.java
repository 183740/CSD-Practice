package sample;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

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
    public void Test1()
    {
        HundredDoors hundredDoors = new HundredDoors(1);
        assertEquals(1,hundredDoors.getOpenDoors());

        //HundredDoors hundredDoors2 = new HundredDoors(2);
        //assertEquals(2,hundredDoors.getOpenDoors());
    }

    @After
    public void After()
    {

    }
}