package sports.complex.com;

import java.util.Iterator;
import java.util.Scanner;

public class Sport {
    public static void main(String[] args) {
        System.out.println("enter 1 to see the time slot for Badminton");
        System.out.println("enter 2 to see the time slot for Football");
        System.out.println("enter 3 to see the time slot for Cricket");

        Scanner sc=new Scanner(System.in);
        int slot= sc.nextInt();
        switch (slot){
            case 1:
                Badminton.badminton();
                break;
            case 2:
                Football.football();
                break;
            case 3:
                Cricket.cricket();
                break;
            default:
                System.out.println("this game is not here");
                break;
        }
    }
}
