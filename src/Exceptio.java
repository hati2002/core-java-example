import java.util.Scanner;

public class Exceptio extends Throwable {
    public static void main(String[] args) {          //Exception is an abnormal condition.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        try {
            int a=num1/0;
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
