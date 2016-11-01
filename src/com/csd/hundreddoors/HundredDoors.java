package com.csd.hundreddoors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuefen on 2016/11/1.
 */
public class HundredDoors {
    protected int NumOfDoors;

    public HundredDoors(int nDoorsCount) {
        this.NumOfDoors = nDoorsCount;
    }

    public List getOpenDoors() {
        return new ArrayList();
    }

    public List getCloseDoors() {
        return new ArrayList();
    }
}