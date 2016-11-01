package com.csd.hundreddoors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xuefen on 2016/11/1.
 */
public class HundredDoors {
    private int NumOfDoors;
    private boolean[] doors;

    public HundredDoors(int nDoorsCount)
    {
        this.NumOfDoors = nDoorsCount;
        this.doors = new boolean[this.NumOfDoors+1];

        //init
        for(int i=0;i<=this.NumOfDoors;i++)
        {
            this.doors[i] = false;
        }

        //start analysis
        for(int i=1;i<=this.NumOfDoors;i++)
        {
            for(int j=0,k=i+j;k<=this.NumOfDoors;k=k+i)
            {
                if(this.doors[k])
                {
                    this.doors[k] = false;
                }else
                {
                    this.doors[k] = true;
                }
            }
        }
    }

    public List<Integer> getOpenDoors() {
        List openDoors = new ArrayList();

        for(int i=1;i<=this.NumOfDoors;i++)
        {
            if(this.doors[i])
                openDoors.add(i);
        }
        return openDoors;
    }

    public List<Integer> getCloseDoors() {
        List closeDoors = new ArrayList();

        for(int i=1;i<=this.NumOfDoors;i++)
        {
            if(!this.doors[i])
                closeDoors.add(i);
        }
        return closeDoors;
    }
}
