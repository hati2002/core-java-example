package javaeaight.com;

interface A{
    void method(String msg);
    void add(int a,int b);
}
public class FunctionalInterfaceExample implements A{
    public static void main(String[] args) {
   FunctionalInterfaceExample fif=new FunctionalInterfaceExample();
   fif.method("hello");
   fif.add(10,20);
    }

    @Override
    public void method(String msg) {
        System.out.println(msg);
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
}
