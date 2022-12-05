package collection.map;

import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(0,11);
        hm.put(1,12);
        hm.put(2,"aaa");
        System.out.println(hm);

        Set s=hm.keySet();
        System.out.println(s);   //print the key

        Collection c=hm.values();    //print the value
        System.out.println(c);

        Set s1=hm.entrySet();
        System.out.println(s1);   //return value in as a set

        Iterator i=s1.iterator();
        while (i.hasNext()){
            Map.Entry m1 = (Map.Entry) i.next();
            System.out.println(m1.getKey()+"   "+m1.getValue());
            if (m1.getKey().equals(1)){
                m1.setValue(22);
            }
        }
        System.out.println(hm);
    }
}
