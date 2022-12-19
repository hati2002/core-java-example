package javaAssesment.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ques20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int num4= sc.nextInt();

        LinkedList<Integer> l=new LinkedList<>();
        l.add(num1);
        l.add(num2);
        l.add(num3);
        l.add(num4);

        //using iterator
     /**   Iterator itr= l.iterator();
        while (itr.hasNext()){
//            System.out.println(itr.next());

            Integer i = (Integer) itr.next();
            if (i.equals(10)){
                itr.remove();
            }
        }
        System.out.println(l);
      */

     //using list-iterator
        ListIterator litr=l.listIterator();
        while (litr.hasNext()){
            Integer i = (Integer) litr.next();
            if (i.equals(10)){
                 litr.remove();
                litr.add(100);
            }
        }
        for (Integer in:l){
            System.out.println(in);
        }

//        while (litr.hasPrevious()){
//            System.out.println(litr.hasPrevious());
//        }
    }
}
