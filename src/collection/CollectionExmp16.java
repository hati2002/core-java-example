package collection;

import java.util.*;

public class CollectionExmp16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the names:");
        String name1= sc.next();
        String name2= sc.next();
        String name3= sc.next();
        System.out.println("enter the number");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();

        HashMap<String,Integer> h=new HashMap<String,Integer>();
        h.put(name1,num1);
        h.put(name2,num2);
        h.put(name3,num3);
        System.out.println(h);
//        Set s=h.entrySet();
//        System.out.println(s);
//        Iterator itr = s.iterator();
        if (num1>60){
            System.out.println(name1+"pass");
        }
        if (num2>60){
            System.out.println(name2+"pass");
        }
        if (num3>60){
            System.out.println(name3+"pass");
        }
        else {
            System.out.println("fail");
        }
    }

    }

