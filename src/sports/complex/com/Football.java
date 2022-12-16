package sports.complex.com;

import java.util.*;

public class Football {
    public static void football(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name:");
        String name= sc.nextLine();

        List<Integer> footballSlot=new ArrayList<>();
        for (int i=1;i<=10;i++){
            footballSlot.add(i);
        }
        char c;
        do {
            System.out.println("slot wise time for Football");
            HashMap<Integer, String> h = new HashMap<Integer, String>();
            h.put(1, "07:00am-07:30am");
            h.put(2, "07:30am-08:00am");
            h.put(3, "08:00am-08:30am");
            h.put(4, "08:30am-09:00am");
            h.put(5, "09:00am-09:30pm");
            h.put(6, "09:30pm-10:00pm");
            h.put(7, "10:00pm-10:30pm");
            h.put(8, "10:30pm-11:00pm");
            h.put(9, "11:00pm-11:30pm");
            h.put(10, "11:30pm-12:00pm");
            System.out.println(h);

            System.out.println("the available slots are:");
            Iterator<Integer> itr = footballSlot.listIterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

            System.out.println("choose one slot");
            int s = sc.nextInt();
            System.out.println("your slot is allocated:" + s);

            if (footballSlot.contains(s)) {
                System.out.println("your slot is allocated" + s);
                footballSlot.remove(s - 1);
            } else {
                System.out.println("slot already booked");
            }
            System.out.println("press y for repeat this process:");
            c = sc.next().charAt(0);
        }
        while (c=='y');
    }
}
