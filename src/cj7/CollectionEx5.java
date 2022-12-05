package cj7;

import java.util.*;

public class CollectionEx5 {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int n4= sc.nextInt();
        tm.put(0,n1);
        tm.put(1,n2);
        tm.put(2,n3);
        tm.put(3,n4);
        System.out.println(tm);

        Set s=tm.entrySet();
        System.out.println(s);

        Iterator i=s.iterator();
        while (i.hasNext()){
            Map.Entry m= (Map.Entry) i.next();
            System.out.println(m.getKey()+"-->"+m.getValue());
        }
    }
}
