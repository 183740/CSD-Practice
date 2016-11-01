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

        toggleAllDoors();
    }

    private void toggleAllDoors() {
        for(int doorNumber = 1;doorNumber<=this.NumOfDoors;doorNumber++)
        {
            toggleDoor(doorNumber);
        }
    }

    private void toggleDoor(int doorNumber) {
        int toggleCount = getToggleCount(doorNumber);
        if(toggleCount%2==0)
        {
            closeDoor(doorNumber);
        }else
        {
            openDoor(doorNumber);
        }
    }

    private void openDoor(int doorNumber) {
        this.openDoors.add(doorNumber);
    }

    private void closeDoor(int doorNumber) {
        this.closeDoors.add(doorNumber);
    }

    private int getToggleCount(int doorNumber) {
        int toggleCount = 0;
        for(int i=1;i<=doorNumber;i++)
        {
            if(doorNumber%i==0)
            {
                toggleCount++;
            }
        }
        return toggleCount;
    }

    public List getOpenDoors() {
        return this.openDoors;
    }

    public List getCloseDoors() {
        return this.closeDoors;
    }
}