package car.com;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Mercedes m=new Mercedes();
        Bmw bm=new Bmw();

        System.out.println("available cars are: mercedes and bmw");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter one car that you want to buy");
        String s= sc.nextLine();
        switch (s){
            case "mercedes":
                System.out.println("these are the mercedes variant");
                m.mercedes();
                break;
            case "bmw":
                System.out.println("these are the bmw variant");
                bm.bmw();
               break;
            default:
                System.out.println("no car found");
                break;
        }
    }
}
