package lambda.exp.com;

interface A{
    public void method();
}
public class LambdaEx1 {
    public static void main(String[] args) {
        //without using lambda exp
        int x=10;
//        A a=new A() {
//            @Override
//            public void method() {
//                System.out.println("this is A class method");
//                System.out.println(x);
//            }
//        };
//        a.method();

        //using lambda exp
        A obj=()->{
            System.out.println(x);
        };
        obj.method();
    }
}
