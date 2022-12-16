package parking.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bike {
    public static void bike(){
        Scanner sc = new Scanner(System.in);
        List<Integer> bike=new ArrayList<Integer>();
        for (int i=1;i<=15;i++){
            bike.add(i);
        }
        char c;
        do {
            System.out.println("enter the bike number to book the slot");
            int regd = sc.nextInt();

            System.out.println("the available slots are:");
            Iterator<Integer> itr = bike.listIterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

            System.out.println("choose one slot");
            int slot = sc.nextInt();
            if (bike.contains(slot)) {


                System.out.println("your bike will park here:" + slot);
                bike.remove(slot - 1);
            }
            else {
                System.out.println("this slot is booked");
            }

            System.out.println("press y for repeat this process:");
            c = sc.next().charAt(0);
        }
        while (c == 'y');
    }
}
