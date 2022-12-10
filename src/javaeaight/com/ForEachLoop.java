package javaeaight.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the games:");
        String game1=sc.nextLine();
        String game2= sc.nextLine();
        String game3= sc.nextLine();

        List<String> l=new ArrayList<>();
        l.add(game1);
        l.add(game2);
        l.add(game3);
//        l.forEach(games-> System.out.println(games));
        l.forEach(System.out::println);  //another way to print

        //forEachOrdered()
        l.stream().forEachOrdered(games-> System.out.println(games));
    }
}
