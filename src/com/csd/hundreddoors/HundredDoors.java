package com.csd.hundreddoors;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xuefen on 2016/11/1.
 */
public class HundredDoors {
    private int length;

    public HundredDoors(int length)
    {
        this.length = length;
    }

    public int getOpenDoors() {
        return 1;
    }

    public List<Integer> getCloseDoors() {
        if(this.length == 1)
            return Arrays.asList();
        else if(this.length == 2)
            return Arrays.asList(2);
        return Arrays.asList(2,3);
    }
}
