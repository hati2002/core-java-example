package collection.map;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers:");
        int num1= sc.nextInt();
        float num2= sc.nextFloat();
        int num3= sc.nextInt();
        System.out.println("enter name:");
        String s= sc.next();

        ArrayList a=new ArrayList();
        a.add(num1);
        a.add(num2);
        a.add(num3);
        a.add(s);
        System.out.println(a);
        //after removing
//        System.out.println(a.remove(2));
//        System.out.println(a);

        ArrayList<Float> aa=new ArrayList<>();  //this is new array list
        aa.add( 7.4f);
        aa.add(2.2f);
        System.out.println("this is a new arraylist"+aa);
      /**
        System.out.println("after retaining");
        a.retainAll(aa);
        System.out.println(a);  //check the common value from both collection and return that value
       */

        //contains check if the value is present or not
        System.out.println(a.contains(1));

        
    }
}
