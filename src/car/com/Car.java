package car.com;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        System.out.println("available cars are: mercedes and bmw");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter one car which you want to buy");
        String s= sc.nextLine();
        switch (s){
            case "mercedes":
                System.out.println("this is mercedes");
                break;
            case "bmw":
                System.out.println("this is bmw");
               break;
            default:
                System.out.println("no car found");
                break;
        }
    }
}
