package sports.complex.com;

import java.util.*;

public class Badminton {
    public static void badminton(){

        Scanner sc=new Scanner(System.in);
             System.out.println("enter a name:");
             String name= sc.nextLine();

        List<Integer> badmintonSlot=new ArrayList<>();
        for (int i=1;i<=10;i++){
          badmintonSlot.add(i);
        }
        char c;
        do {
            System.out.println("slot wise time for Badminton");
            HashMap<Integer, String> h = new HashMap<Integer, String>();
            h.put(1, "07:00am-08:00am");
            h.put(2, "08:00am-09:00am");
            h.put(3, "09:00am-10:00am");
            h.put(4, "10:00am-11:00am");
            h.put(5, "11:00am-12:00pm");
            h.put(6, "12:00pm-13:00pm");
            h.put(7, "13:00pm-14:00pm");
            h.put(8, "15:00pm-16:00pm");
            h.put(9, "17:00pm-18:00pm");
            h.put(10, "19:00pm-20:00pm");
            System.out.println(h);

            System.out.println("the available slots are:");
            Iterator<Integer> itr = badmintonSlot.listIterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

            System.out.println("choose one slot");
            int s = sc.nextInt();

            if (badmintonSlot.contains(s)) {
                System.out.println("your slot is allocated:" + s);
                badmintonSlot.remove(s - 1);
            } else {
                System.out.println("slot already booked");
            }
            System.out.println("press y for repeat this process:");
            c = sc.next().charAt(0);
        }
        while (c=='y');
    }
}
