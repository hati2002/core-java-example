package javaAssesment.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int num4= sc.nextInt();

        LinkedList l=new LinkedList<>();
        l.add(num1);
        l.add(num2);
        l.add(num3);
        l.add(num4);

        //using iterator
        Iterator<Integer> itr= l.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //using list-iterator
        ListIterator itr1=l.listIterator();
        while (itr1.hasNext()){
            Integer i = (Integer) itr1.next();
            if (i.equals(10)){
                itr1.remove();
            }
        }
        System.out.println(l);
    }
}
