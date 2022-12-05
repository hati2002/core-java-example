package multithread.com;

public class MulThreadEx1 implements Runnable {
    public static void main(String[] args) {
        Thread t=new Thread("abc");
        Thread t2=new Thread("bc");
        t.start();
        t2.start();
        try {
            t.sleep(1000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        t.setPriority(2);
        System.out.println(t.getName());
        System.out.println(t2.getName());
        System.out.println(t.getPriority());
        System.out.println(t2.getPriority());
        System.out.println("Thread Running");
    }

    @Override
    public void run() {

    }
}
