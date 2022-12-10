package javaeaight.com;


interface inter{
    default void method(){
        System.out.println("this is default method");
    }
    void method1(String name);
    static void method2(int i){
        System.out.println(i);
    }
}
public class DefaultMethod implements inter{
    public static void main(String[] args) {
   DefaultMethod dm=new DefaultMethod();
   dm.method1("suman");
   inter.method2(77);
    }

    @Override
    public void method1(String name) {
        System.out.println(name);
    }
}
