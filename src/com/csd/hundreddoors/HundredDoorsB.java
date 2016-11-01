package com.csd.hundreddoors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuefen on 2016/11/1.
 */
public class HundredDoorsB extends HundredDoors {
    private List openDoors;
    private List closeDoors;

    public HundredDoorsB(int nDoorsCount)
    {
        super(nDoorsCount);

        this.openDoors = new ArrayList();
        this.closeDoors = new ArrayList();

        for(int doorNumber = 1;doorNumber<=this.NumOfDoors;doorNumber++)
        {
            int toggleCount = 0;
            for(int i=1;i<=doorNumber;i++)
            {
                if(doorNumber%i==0)
                {
                    toggleCount++;
                }
            }
            if(toggleCount%2==0)
            {
                this.closeDoors.add(doorNumber);
            }else
            {
                this.openDoors.add(doorNumber);
            }
        }
    }

    public List getOpenDoors() {
        return this.openDoors;
    }

    public List getCloseDoors() {
        return this.closeDoors;
    }
}