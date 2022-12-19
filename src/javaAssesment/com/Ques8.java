package javaAssesment.com;

import java.util.TreeSet;


public class Ques8 {
    public static void main(String[] args){

        TreeSet<Suman> set=new TreeSet<>();
       Suman su=new Suman();
       su.setA(11);
       su.setC('b');
       su.setS("Suman");
       set.add(su);
        System.out.println(set);

    }
}
