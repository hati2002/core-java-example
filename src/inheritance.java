
class A{
    public void m1(){
        System.out.println("this is m1");
    }

    public void m2(){
        System.out.println("this is m2");
    }
}

class B extends A{
    public void m3(){
        System.out.println("this is m3");
    }
}
public class inheritance {
    public static void main(String[] args) {
      B b=new B();
      b.m3();
      b.m1();
    }
}
