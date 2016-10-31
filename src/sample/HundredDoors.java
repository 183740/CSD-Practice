package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuefen on 2016/10/31.
 */
public class HundredDoors {

    private int length = 0;
    boolean[] doors;

    protected HundredDoors(int length)
    {
        this.length = length;
        doors = new boolean[length + 1];
        for(int i=0;i<doors.length;i++)
        {
            doors[i] = false;
        }

        for(int j=1;j<=length;j++)
        {

        }
    }

    public int getOpenDoors() {


        return 1;
    }
}
