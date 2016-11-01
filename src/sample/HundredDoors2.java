package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuefen on 2016/10/31.
 */
public class HundredDoors2 extends HundredDoors{
    private List openDoors = new ArrayList();
    private List closeDoors = new ArrayList();

    public HundredDoors2(int nDoors) {
        super(nDoors);
        StartToggleDoors();
    }

    private void StartToggleDoors() {
        for(int doorNumber = 1;doorNumber<=this.getDoorsCount();doorNumber++)
        {
            toggleDoor(doorNumber);
        }
    }

    private void toggleDoor(int doorNumber) {
        setDoorStatus(doorNumber, getToggleCount(doorNumber));
    }

    private void setDoorStatus(int doorNumber, int toggleCount) {
        if(toggleCount%2==0)
        {
            this.closeDoors.add(doorNumber);
        }else
        {
            this.openDoors.add(doorNumber);
        }
    }

    private int getToggleCount(int doorNumber) {
        int toggleCount = 0;
        for(int i=1;i<=doorNumber;i++)
        {
            if (doorNumber%i==0)
                toggleCount++;
            this.checkCount();
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