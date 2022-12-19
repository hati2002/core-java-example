package methodreference.com;

public class MethodReferenceEx2 {

    public static void method(){
        System.out.println("this is a method");
    }
    public static void main(String[] args) {
//        using predefined functional interface Runnable to refer static method
        Thread t=new Thread(MethodReferenceEx2::method);
        t.start();
    }
}
