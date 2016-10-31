package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuefen on 2016/10/31.
 */
public class HundredDoors1 extends HundredDoors{
    private boolean[] doors;

    protected HundredDoors1(int nDoors)
    {
        super(nDoors);
        closeAllDoors();
        StartToggleDoors(nDoors);
    }

    private void StartToggleDoors(int nDoors) {
        for(int j=1;j<=nDoors;j++)
        {
            for(int k = 0; k<nDoors;k=k+j)
            {
                int doorNumber = j+k;
                if(doorNumber>0 && doorNumber <=nDoors)
                {
                    toggle(doorNumber);
                }
            }
        }
    }

    private void toggle(int doorNumber) {
        if(isDoorOpen(doorNumber))
            closeDoor(doorNumber);
        else
            openDoor(doorNumber);
    }

    private void closeDoor(int doorNumber) {
        doors[doorNumber] = false;
    }

    private void openDoor(int doorNumber) {
        doors[doorNumber] = true;
    }

    private void closeAllDoors() {

        doors = new boolean[this.getDoorsCount()+1];

        for(int i = 0; i<=this.getDoorsCount(); i++)
        {
            closeDoor(i);
        }
    }

    public List getOpenDoors() {
        List openDoors = new ArrayList();

        for(int i = 1; i<= this.getDoorsCount(); i++)
        {
            if(isDoorOpen(i))
            {
                openDoors.add(i);
            }
        }

        return openDoors;
    }

    private boolean isDoorOpen(int doorNumber) {
        return this.doors[doorNumber];
    }

    public List getCloseDoors() {
        int countOpen = 0;
        List closeDoors = new ArrayList();

        for(int i = 1; i<= this.getDoorsCount(); i++)
        {
            if(!isDoorOpen(i))
            {
                closeDoors.add(i);
            }
        }

        return closeDoors;
    }
}