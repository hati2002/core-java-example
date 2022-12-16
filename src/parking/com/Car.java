package parking.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Car{
   public static void car(){

       Scanner sc = new Scanner(System.in);

       List<Integer> car=new ArrayList<Integer>();
       for (int i=1;i<=15;i++){
           car.add(i);
       }
       char c;
       do {
           System.out.println("enter the car number to book the slot");
           int regd = sc.nextInt();

           System.out.println("the available slots are:");
           Iterator<Integer> itr = car.listIterator();
           while (itr.hasNext()) {
               System.out.println(itr.next());
           }

           System.out.println("choose one slot");
           int slot = sc.nextInt();

           if (car.contains(slot)) {
               System.out.println("your car will be parked here:" + slot);
               car.remove(slot - 1);
           }
           else {
               System.out.println("this slot is booked already");
           }

           System.out.println("press y for repeat this process:");
           c = sc.next().charAt(0);
       }
       while (c == 'y');
   }
}

