package collection.map;

import java.util.*;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        System.out.println(lhm);

        Set s=lhm.keySet();
        System.out.println(s);

        Collection c=lhm.values();
        System.out.println(c);

        Set s1=lhm.entrySet();
        System.out.println(s1);

        Iterator i=s1.iterator();
        while (i.hasNext()){
            Map.Entry e= (Map.Entry) i.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
