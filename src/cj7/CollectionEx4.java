package cj7;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class CollectionEx4 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int n4= sc.nextInt();
        a.add(n1);
        a.add(n2);
        a.add(n3);
        a.add(n4);
        System.out.println("This is arraylist:"+ a);
        //  Write a program to reverse ArrayList in java
        System.out.println("after reverse");
        Collections.reverse(a);
        System.out.println(a);
    }
}
