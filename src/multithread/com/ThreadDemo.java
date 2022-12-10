package multithread.com;
class Hi{
    public void m1(){
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

class Hello{
    public void m1(){
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

public class ThreadDemo {
    public static void main(String[] args) {
        Hi obj1=new Hi();
        Hello obj2=new Hello();
        obj1.m1();
        obj2.m1();
    }
}
