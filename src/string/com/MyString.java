package string.com;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name");
        String name1= sc.nextLine();
        String name2=sc.nextLine();
        //method
        System.out.println(name1.charAt(2));
        System.out.println(name1.codePointAt(1));
        System.out.println(name1.codePointBefore(1));
        System.out.println(name1.codePointCount(1,4));
        System.out.println(name1.compareTo(name2));
        System.out.println(name1.concat(name2));
        System.out.println(name1.contains("h"));  //return true if the value is present on string
        System.out.println(name1.contentEquals("suman"));  //if name1 same with cs then it return true
        System.out.println(name1.endsWith("i"));
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name1.hashCode());
        System.out.println(name1.indexOf("s"));
        System.out.println(name1.intern());
        System.out.println(name1.isEmpty());
        System.out.println(name1.lastIndexOf("suman"));
        System.out.println(name1.length());
        System.out.println(name1.matches("suman"));
        System.out.println(name1.offsetByCodePoints(2,3));
        System.out.println(name1.replace("s","S"));
        System.out.println(name2.replaceFirst("h","H"));
        System.out.println(name1.startsWith("s"));
        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());

        //copyValueOf()
        char[] s={'a','b','c','d'};
        String str="";
        str=str.copyValueOf(s);
        System.out.println(str);

        //split() method
        String text = "Java is a fun programming language";
        String[] result = text.split(" ");
        System.out.print("result = ");
        for (String str1 : result) {
            System.out.print(str1 + ", ");
        }
    }
}
