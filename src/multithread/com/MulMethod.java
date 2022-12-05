package multithread.com;

public class MulMethod extends Thread{
    public static void main(String[] args) {
        MulMethod m=new MulMethod();
        MulMethod m1=new MulMethod();
        System.out.println("t1 thread priority : " +m.getPriority());
        System.out.println("t1 thread priority : " +m1.getPriority());
        m.start();
        m1.start();
//        m.run();
//        m1.run();
    }

    @Override
    public void run() {
       /** System.out.println("thread is running");
        for (int i=0;i<=5;i++){
            try {
                Thread.sleep(100);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
//        System.out.println(Thread.currentThread().getName());
        */
        System.out.println("running thread name is:"+Thread.currentThread().getName());
    }
}
