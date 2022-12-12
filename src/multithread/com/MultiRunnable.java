package multithread.com;

 class Hii implements Runnable{

     @Override
     public void run() {
         for (int i=0;i<5;i++){
             System.out.println("hii");
             try {
                 Thread.sleep(400);
             }
             catch (Exception e){
                 System.out.println(e);
             }
         }
     }
 }

class Helloo implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(400);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class MultiRunnable {
    public static void main(String[] args) {
        Hii h1=new Hii();
        Helloo hl=new Helloo();

        Thread t1=new Thread(h1);
        Thread t2=new Thread(hl);
        t1.start();
        t2.start();
//    hl.run();
//    h1.run();
    }
}
