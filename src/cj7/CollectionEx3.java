package cj7;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;

public class CollectionEx3 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int n4= sc.nextInt();
        hs.add(n1);
        hs.add(n2);
        hs.add(n3);
        hs.add(n4);
        System.out.println(hs);
//        Write a program to convert HashSet to Array
        int [] arr=new int[hs.size()];
        int i=0;
        for (Integer i1:hs){
            arr[i++]=i1;
        }
      for (Integer n:arr){
          System.out.println(n);
      }
    }
}
