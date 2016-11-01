package com.csd.hundreddoors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuefen on 2016/11/1.
 */
public class HundredDoors {
    public static final int CONSTANT_ZERO_POINT = 0;
    private int NumOfDoors;
    private boolean[] doors;

    public HundredDoors(int nDoorsCount)
    {
        this.NumOfDoors = nDoorsCount;
        this.doors = new boolean[this.NumOfDoors+1];

        closeAllDoors();
        toggleAllDoors();
    }

    private void toggleAllDoors() {
        for(int toggleSpace=1;toggleSpace<=this.NumOfDoors;toggleSpace++)
        {
            for(int doorNumber = toggleSpace+CONSTANT_ZERO_POINT; doorNumber<=this.NumOfDoors; doorNumber+=+toggleSpace)
            {
                toggleDoor(doorNumber);
            }
        }
    }

    private void toggleDoor(int doorNumber) {
        if(isDoorOpen(doorNumber))
        {
            closeDoor(doorNumber);
        }else
        {
            openDoor(doorNumber);
        }
    }

    private void openDoor(int doorNumber) {
        this.doors[doorNumber] = true;
    }

    private void closeDoor(int doorNumber) {
        this.doors[doorNumber] = false;
    }

    private boolean isDoorOpen(int doorNumber) {
        return this.doors[doorNumber];
    }

    private void closeAllDoors() {
        for(int i=0;i<=this.NumOfDoors;i++)
        {
            closeDoor(i);
        }
    }

    public List<Integer> getOpenDoors() {
        List openDoors = new ArrayList();

        for(int i=1;i<=this.NumOfDoors;i++)
        {
            if(isDoorOpen(i))
                openDoors.add(i);
        }
        return openDoors;
    }

    public List<Integer> getCloseDoors() {
        List closeDoors = new ArrayList();

        for(int i=1;i<=this.NumOfDoors;i++)
        {
            if(!isDoorOpen(i))
                closeDoors.add(i);
        }
        return closeDoors;
    }
}