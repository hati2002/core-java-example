package cj7;

import java.util.*;

public class CollectionEx6 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int n4= sc.nextInt();
        hm.put(0,n1);
        hm.put(1,n2);
        hm.put(2,n3);
        hm.put(3,n4);
        System.out.println(hm);

    }
}
