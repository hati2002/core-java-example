package parking.com;

import java.util.Scanner;

public class ParkingSlot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for bike to booked slot");
        System.out.println("enter 2 for car to booked slot");
        int s= sc.nextInt();

        switch (s){
            case 1:
                Bike.bike();
                break;
            case 2:
                Car.car();
                break;
            default:
                System.out.println("enter valid number");
                break;
        }
    }
}
