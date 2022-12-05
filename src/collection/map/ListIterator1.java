package collection.map;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println("l---->"+l);

        ListIterator litr=l.listIterator();
        while (litr.hasNext()){
            int s= (int) litr.next();
            if (s==1){
                 litr.remove();
            }
        }
        System.out.println(l);
    }
}
