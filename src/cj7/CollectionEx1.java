package cj7;

import java.util.*;

public class CollectionEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int n4= sc.nextInt();
        al.add(n1);
        al.add(n2);
        al.add(n3);
        al.add(n4);
        //Iterate Arraylist using listiterator
        ListIterator li=al.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

//       Arraylist add element at specific index
        al.add(2,11);
        System.out.println(al);

        //insert an element to arraylist using listiterator
        ListIterator l=al.listIterator();
        l.add(89);
        System.out.println(al);


        //sort element arraylist
        Collections.sort(al);
        System.out.println(al);

        //replace an element at specified index
        al.set(2,22);
        System.out.println(al);

        //search element of an arraylist
        System.out.println(al.get(2));

       //remove element from specified index
        al.remove(2);
        System.out.println(al);

//   remove duplicates from arraylist
       for (int i=0;i<= al.size();i++){
           for (int j=i+1;j<=al.size();j++){
               if (al.get(i).equals(al.get(j))){
                   al.remove(j);
                   j--;
               }
           }
       }

    }
}
