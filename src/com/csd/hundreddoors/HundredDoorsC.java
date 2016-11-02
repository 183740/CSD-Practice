package com.csd.hundreddoors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuefen on 2016/11/2.
 */
public class HundredDoorsC extends HundredDoors {
    private int[] doorToggleCount;
    private List openDoors;
    private List closeDoors;

    public HundredDoorsC(int nDoorsCount) throws Exception {
        super(nDoorsCount);

        this.doorToggleCount = new int[this.NumOfDoors+1];
        for(int i=0;i<=this.NumOfDoors;i++)
        {
            this.doorToggleCount[i] = 0;
            this.checkingCount();
        }
        this.openDoors = new ArrayList();
        this.closeDoors = new ArrayList();

        toggleAllDoors();
    }

    private void toggleAllDoors() {
        for(int toggleSpace = 1;toggleSpace<=this.NumOfDoors;toggleSpace++)
        {
            toggleDoor(toggleSpace);
        }

        for(int doorNum=1;doorNum<=this.NumOfDoors;doorNum++)
        {
            if(this.doorToggleCount[doorNum]%2==0)
            {
                this.closeDoor(doorNum);
            }else
            {
                this.openDoor(doorNum);
            }
            this.checkingCount();
        }
    }

    private void toggleDoor(int toggleSpace) {
        for(int doorNumber=toggleSpace;doorNumber<=this.NumOfDoors;doorNumber=doorNumber+toggleSpace)
        {
            this.doorToggleCount[doorNumber]++;
            this.checkingCount();
        }
    }

    public List getOpenDoors() {
        return this.openDoors;
    }

    public List getCloseDoors() {
        return this.closeDoors;
    }

    private void openDoor(int doorNumber) {
        this.openDoors.add(doorNumber);
    }

    private void closeDoor(int doorNumber) {
        this.closeDoors.add(doorNumber);
    }
}