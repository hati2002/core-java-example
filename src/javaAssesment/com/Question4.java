package javaAssesment.com;

import java.util.Scanner;

class  Student{
    String name;
    int id;

    Student(String name,int id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
public class Question4 {
    public static void main(String[] args) {
      Student s=new Student("abcd",564);
        System.out.println(s.toString());

        System.out.println(s.hashCode());

        //equals()
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println(myStr1.equals(myStr2));
    }
}
