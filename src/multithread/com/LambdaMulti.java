package multithread.com;

public class LambdaMulti {
    public static void main(String[] args) {
        Runnable r1=()->
            {
                for (int i=0;i<5;i++){
                    System.out.println("hii");
                    try {
                        Thread.sleep(400);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                }
            };
        Runnable r2=()-> {
                for (int i=0;i<5;i++){
                    System.out.println("hello");
                    try {
                        Thread.sleep(400);
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
    }
}
