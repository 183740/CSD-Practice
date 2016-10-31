package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuefen on 2016/10/31.
 */
public class HundredDoors {

    private int length = 0;

    private int countClose = 0;
    private boolean[] doors;

    protected HundredDoors(int length)
    {
        this.length = length;
        doors = new boolean[length + 1];

        for(int i=0;i<=this.length;i++)
        {
            doors[i] = false;
        }

        for(int j=1;j<=length;j++)
        {
            for(int k = 0; k<length;k++)
            {
                int doorNumber = j+k;
                if(doorNumber>0 && doorNumber <=length)
                {
                    if(doors[doorNumber] == false)
                        doors[doorNumber] = true;
                    else
                        doors[doorNumber] = false;
                }
            }
        }
    }

    public List getOpenDoors() {
        int countOpen = 0;
        List openDoors = new ArrayList();

        for(int i =1;i<=length;i++)
        {
                if(doors[i] == true)
                {
                    openDoors.add(i);
                }
        }

        return openDoors;
    }

    public List getCloseDoors() {
        int countOpen = 0;
        List closeDoors = new ArrayList();

        for(int i =1;i<=length;i++)
        {
            if(doors[i] == false)
            {
                closeDoors.add(i);
            }
        }

        return closeDoors;
    }
}
