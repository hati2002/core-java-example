package parking.com;

public class ParkingSlot {
    int row;
    int col;
    int level;
    Car carOccupySlot;
    Bike bikeOccupySlot;

    public ParkingSlot(int row,int col,int level,Car carOccupySlot, Bike bikeOccupySlot){
        this.row=row;
        this.col=col;
        this.level=level;
        this.carOccupySlot=carOccupySlot;
        this.bikeOccupySlot=bikeOccupySlot;
    }
}
