package collection.map;

import java.util.LinkedList;
import java.util.Scanner;

public class MyLinkList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers:");
        int num1= sc.nextInt();
        float num2= sc.nextFloat();
        int num3= sc.nextInt();
        System.out.println("enter name:");
        String s= sc.next();

        LinkedList l=new LinkedList();
         l.add(num1);
         l.add(num2);
         l.add(num3);
         l.add(s);
         l.addFirst(2);
         l.addLast(55);

        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());

        System.out.println(l.removeFirst());
        System.out.println(l);

        System.out.println(l.removeLast());
        System.out.println(l);
    }
}
