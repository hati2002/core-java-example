package javaAssesment.com;

class Add implements Runnable{
int sum=0;
    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

class Average implements Runnable{
        int sum=0;
        float avg;
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            sum=sum+i;
        }
        avg=sum/5;
        System.out.println(avg);
    }
}
public class Ques10 {
    public static void main(String[] args) {
    Add a=new Add();
    a.run();

        Average av=new Average();
        av.run();
    }
}
