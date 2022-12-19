package lambda.exp.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LambdaForEach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int num4= sc.nextInt();

        List l=new ArrayList<>();
        l.add(num1);
        l.add(num2);
        l.add(num3);
        l.add(num4);

        l.forEach(
                (n)->System.out.println(n)
        );
    }
}
