package javaAssesment.com;

class Hii extends Thread{
    @Override
    public void run() {
        System.out.println("Hiii");
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }
}

class Hello extends Thread{
    @Override
    public void run() {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }
}

public class Ques13 {
    public static void main(String[] args) {
       Hii h=new Hii();
       h.start();

       Hello hh=new Hello();
       hh.start();
    }
}
