package javaAssesment.com;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Ques6 {

    public void earlierDate(int date, int a){
        if (a>date){
            System.out.println("present date is earlier");
        }
    }

    public void afterDate(int date,int a){
        if (a<date){
            System.out.println("present date is after");
        }
    }

    public static void main(String[] args) {
        Ques6 q=new Ques6();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a date");
        int date= sc.nextInt();

      Date d=new Date();
      int a=d.getDate();
      System.out.println(a);

        q.earlierDate(date,a);
        q.afterDate(date,a);
    }
}
