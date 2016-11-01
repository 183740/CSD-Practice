package com.csd.hundreddoors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuefen on 2016/11/1.
 */
public class HundredDoorsA extends HundredDoors {
    private boolean[] doors;

    public HundredDoorsA(int nDoorsCount) throws Exception {
        super(nDoorsCount);
        this.doors = new boolean[this.NumOfDoors+1];

        closeAllDoors();
        toggleAllDoors();
    }

    private void closeAllDoors() {
        for(int i=0;i<=this.NumOfDoors;i++)
        {
            closeDoor(i);
            this.checkingCount();
        }
    }

    protected void toggleAllDoors() {
        for(int toggleSpace=1;toggleSpace<=this.NumOfDoors;toggleSpace++)
        {
            for(int doorNumber = toggleSpace; doorNumber<=this.NumOfDoors; doorNumber+=+toggleSpace)
            {
                toggleDoor(doorNumber);
                this.checkingCount();
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

    private boolean isDoorOpen(int doorNumber) {
        return this.doors[doorNumber];
    }

    private void openDoor(int doorNumber) {
        this.doors[doorNumber] = true;
    }

    private void closeDoor(int doorNumber) {
        this.doors[doorNumber] = false;
    }

    public List<Integer> getOpenDoors() {
        List openDoors = new ArrayList();

        for(int i=1;i<=this.NumOfDoors;i++)
        {
            if(isDoorOpen(i))
                openDoors.add(i);
            this.checkingCount();
        }
        return openDoors;
    }

    public List<Integer> getCloseDoors() {
        List closeDoors = new ArrayList();

        for(int i=1;i<=this.NumOfDoors;i++)
        {
            if(!isDoorOpen(i))
                closeDoors.add(i);
            this.checkingCount();
        }
        return closeDoors;
    }
}