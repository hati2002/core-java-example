package functional.inter.com;

interface Inter1{
     default void method(){                   //non-functional interface
        System.out.println("this is a default method");
    }
}

@FunctionalInterface
interface Inter2 extends Inter1{
    void m(String name);
}
public class FunctionalInterEx3 {
    public static void main(String[] args) {

        Inter2 i=(name)->{
            System.out.println(" the name is:"+name);
        };
        i.m("suman");
    }
}
