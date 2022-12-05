package collection.map;

import java.util.ArrayList;
import java.util.LinkedList;

public class InterConnection {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(11);
        a.add(44);
        a.add(55);
        System.out.println("l1-->"+ a);

        LinkedList l=new LinkedList(a);
        l.add(1,5);
        l.add(2,10);
        l.add(3,15);
        System.out.println("l2--->"+l);

        ArrayList a1=new ArrayList(l);
        System.out.println(a1);

    }
}
