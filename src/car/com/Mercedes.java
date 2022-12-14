package car.com;

import java.util.HashMap;
import java.util.Scanner;

public class Mercedes {
       private int m1=5;
       private int m2=3;
       private  int m3=10;
       public void mercedes(){
           HashMap<String,Integer> hm=new HashMap<String,Integer>();

           hm.put("suv",m1);
           hm.put("sedan",m2);
           hm.put("suv-compact",m3);
           System.out.println(hm);
           Scanner sc=new Scanner(System.in);
           String s= sc.next();
           switch (s){
               case "suv":
                   m1=m1-1;
                   System.out.println("suv hase been booked");
                   System.out.println("Now the total available cars are:"+m1);
                   break;
               case "sedan":
                   m2=m2-1;
                   System.out.println("sedan hase been booked");
                   System.out.println("Now the total available cars are:"+m2);
                   break;
               case "suv-compact":
                   m3=m3-1;
                   System.out.println("suv-compact hase been booked");
                   System.out.println("Now the total available cars are:"+m3);
                   break;
               default:
                   System.out.println("no car available");
                   break;
           }
       }

}
