package javaeaight.com;

interface Store{
    void price();
}
public class MethodReference {

    public static void method(){
        System.out.println("this is a static method");
    }
    public static void main(String[] args) {

        // Referring static method(without using predefined function)
        Store s=MethodReference::method;
        // Calling interface method
          s.price();

          //using predefined function
        Thread t=new Thread(MethodReference::method);
        t.start();
    }
}
