package javaAssesment.com;

import java.util.Scanner;

public class Ques19 {
    public static void main(String[] args) throws InvalidUserName {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name:");
        String name= sc.nextLine();

        while (name.length()<10 && name.contains("&")){

            System.out.println( new InvalidUserName());
            name= sc.nextLine();
        }
        System.out.println(name);

    }
}
