package javaeaight.com;

import java.util.StringJoiner;

public class StringJoin {
    public static void main(String[] args) {
//        StringJoiner sj=new StringJoiner(",");
        StringJoiner sj=new StringJoiner(",","[","]");
        sj.add("a");
        sj.add("b");
        sj.add("c");
        sj.add("d");
        sj.add("e");
        System.out.println(sj);

        StringJoiner sj2=new StringJoiner(";");
        sj2.add("x");
        sj2.add("y");
        sj2.add("z");
        System.out.println(sj2);
        //merge two string
        StringJoiner s=sj.merge(sj2);
        System.out.println(s);

        //stringjoiner method
        StringJoiner sj3=new StringJoiner(",");
        sj3.setEmptyValue("java");
        System.out.println(sj3);
        //length
        System.out.println(sj3.length());

        //toString
        System.out.println(sj3.toString());

    }
}
