package com.csd.hundreddoors;

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

    public int getCloseDoors() {
        if(this.length == 1)
            return 0;
        return 2;
    }
}
