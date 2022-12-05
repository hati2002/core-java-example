package multithread.com;

public class MulThread implements Runnable{
    public static void main(String[] args) {
        Thread t1=new Thread("abc");
        Thread t2=new Thread("def");
        Thread t3=new Thread(String.valueOf(123));
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println("id is:"+t3.getId());
    }

    @Override
    public void run() {

    }
}
