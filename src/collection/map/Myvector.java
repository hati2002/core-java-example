package collection.map;

import java.util.Enumeration;
import java.util.Vector;

public class Myvector {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(11);   //collection
        v.add(12);
        v.add(13);
        v.add(1,15);      //list
        v.addElement(22);        //vector
        System.out.println("Vector list"+v);

        //remove
//        v.remove(1);
////       v.removeElement(11);
////        v.removeAllElements();
//        v.removeElementAt(3);
//        System.out.println("after removing"+v);

        //getindex
        System.out.println(v.get(2));
        System.out.println(v.elementAt(1));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        //other
        System.out.println(v.size());
        System.out.println("current capacity is"+v.capacity());

        //Enumeration elements() --> this is use to traverse the vector
        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());

        }
    }
}
