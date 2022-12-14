package parking.com;

import java.util.List;

public class Level {
    int levelNumber;
    int rows;
    public List<ParkingSlot> takenSlot;
    int slotsPerRow=2;

    public ParkingSlot findAvailableSlot(){
        return null;
    }

    public boolean park(Car car){
        return false;
    }

    public boolean park(Bike bike){
        return false;
    }
}
