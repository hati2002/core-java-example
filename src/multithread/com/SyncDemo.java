package multithread.com;

class Counter{
    int count;
    public void increment(){
        count++;
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        Counter c=new Counter();
        c.increment();
        System.out.println("count"+ c.count);
    }
}
