package cj7;

import collection.map.Arr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class CollectionEx2 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int n4= sc.nextInt();
        ll.add(n1);
        ll.add(n2);
        ll.add(n3);
        ll.add(n4);
        System.out.println(ll);
//Write a program to convert LinkedList to ArrayList?
        ArrayList al=new ArrayList(ll);
        System.out.println("after converting ll to al"+al);

    }
}
