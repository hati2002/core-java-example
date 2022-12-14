package car.com;

import java.util.HashMap;
import java.util.Scanner;

public class Bmw {
    private int b1=5;
    private int b2=3;
    private  int b3=10;
    public void bmw(){
        HashMap<String,Integer> hm1=new HashMap<String,Integer>();

        hm1.put("Sav",b1);
        hm1.put("Coupe",b2);
        hm1.put("Convertible",b3);
        System.out.println(hm1);
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        switch (s){
            case "Sav":
                b1=b1-1;
                System.out.println("Sav hase been booked");
                System.out.println("Now the total available cars are:"+b1);
                break;
            case "Coupe":
                b2=b2-1;
                System.out.println("Coupe hase been booked");
                System.out.println("Now the total available cars are:"+b2);
                break;
            case "Convertible":
                b3=b3-1;
                System.out.println("Convertible hase been booked");
                System.out.println("Now the total available cars are:"+b3);
                break;
            default:
                System.out.println("no car available");
                break;
        }
    }
}
