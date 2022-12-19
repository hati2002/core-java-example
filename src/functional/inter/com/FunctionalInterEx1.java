package functional.inter.com;

@FunctionalInterface
interface Demo{
    void method(String name);
}

public class FunctionalInterEx1 implements Demo{
    public void method(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
       FunctionalInterEx1 fi=new FunctionalInterEx1();
       fi.method("suman");
    }
}
