
interface  A2 {
    public void sound();               // Methods inside interface must not be static, final, native or strictfp.
}
                                      //   All variables declared inside interface are implicitly public, static and final.
class B2 implements A2{
    public void sound(){
        System.out.println("this is a method");       //in interface all method will be abstract
    }
}

public class Interfac {
    public static void main(String[] args) {
     B2 b=new B2();
     b.sound();
    }
}
