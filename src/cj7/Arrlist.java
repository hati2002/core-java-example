package cj7;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrlist {
    public static void main(String[] args) {
        ArrayList<String> name= new ArrayList<String>();
//        Arrlist a=new Arrlist();

        name.add("aaa");
        name.add("bbb");
        name.add("ccc");
        name.add(2,"ddd");
//        name.clear();        //only [] will print
        //        System.out.println(name);

        /**
        boolean n=name.contains("aac");     //Returns true if this list contains the specified element.
        if (n){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
         */

        System.out.println(name.get(2));
        System.out.println(name.indexOf("ccc"));

        boolean b=name.isEmpty();
        if (b){
            System.out.println("arrlist is empty");
        }
        else {
            System.out.println("not empty");
        }

        //create copy of a variable
        ArrayList<String> clone=(ArrayList<String>)name.clone();
        System.out.println("this store "+clone);

//        System.out.println(name.remove(2));
        System.out.println(name.subList(1,3));

    }
}
