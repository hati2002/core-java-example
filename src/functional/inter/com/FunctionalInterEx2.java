package functional.inter.com;

interface Calculator{
    int add(int a,int b);
}
@FunctionalInterface
interface Calculator1 extends Calculator{
   public static void subtract(){
       System.out.println("one interface can extends from another if there is no abstract method");
       System.out.println("this is static method");
   }
}
public class FunctionalInterEx2 {
    public static void main(String[] args) {
        Calculator1.subtract();

        Calculator1 c1=(a,b)->{
            return a+b;
        };
        System.out.println(c1.add(10,20));
    }
}
