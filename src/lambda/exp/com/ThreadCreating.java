package lambda.exp.com;

public class ThreadCreating {
    public static void main(String[] args) {
        //without using lambda exp
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("this is runnable method");
            }
        };
        r.run();

        //with using lambda exp
        Runnable r1=()->{
            System.out.println("this is runnable interface");
        };
//        r1.run();

        Thread t=new Thread(r1);
        t.start();
    }
}
