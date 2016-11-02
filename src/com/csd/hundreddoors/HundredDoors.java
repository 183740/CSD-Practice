package com.csd.hundreddoors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuefen on 2016/11/1.
 */
public class HundredDoors {
    protected int NumOfDoors;
    private int totalCheckingCount;

    public HundredDoors(int nDoorsCount) throws Exception {
        if(nDoorsCount>0) {
            this.NumOfDoors = nDoorsCount;
            this.totalCheckingCount = 0;
        }else
        {
            throw new Exception("Invalid number of doors : " + String.valueOf(nDoorsCount));
        }
    }

    public static HundredDoors getHundredDoors(int nDoorsCount) throws Exception {
        if(nDoorsCount>10) {
            return new HundredDoorsA(nDoorsCount);
        }else
        {
            return new HundredDoorsB(nDoorsCount);
        }
    }

    public List getOpenDoors() {
        return new ArrayList();
    }

    public List getCloseDoors() {
        return new ArrayList();
    }

    public int getTotalCheckingCount()
    {
        return this.totalCheckingCount;
    }

    public void checkingCount()
    {
        this.totalCheckingCount++;
    }
}