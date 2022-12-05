import javax.naming.NamingEnumeration;

interface A1{
     void m1();
}
class B1 implements A1 {
    public void m1(){
        System.out.println("this is m1");
    }
}

class C1 extends B1 {

    @Override
    public void m1() {
        System.out.println("this is class c method");
    }
}
public class Interface {
    public static void main(String[] args) {
        C1 c=new C1();
        c.m1();

    }
}
