
abstract class A3{
    public void m1(){
        System.out.println("this is a method");
    }
    abstract void m2();
}
class B3 extends A3{
    public void m2(){
        System.out.println("this is another method");
    }
}
public class Abstract {
    public static void main(String[] args) {
      B3 b=new B3();
      b.m2();
      b.m1();
    }
}
