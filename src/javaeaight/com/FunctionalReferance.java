package javaeaight.com;

import java.util.function.BiFunction;

class Arithmetic {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
}

public class FunctionalReferance {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int res=adder.apply(10,20);
        System.out.println("addition is-->"+res);

        BiFunction<Integer, Integer, Integer> subtract = Arithmetic::sub;
        int res1=subtract.apply(20,10);
        System.out.println("subtraction is-->"+res1);

        BiFunction<Integer, Integer, Integer> multiplication = Arithmetic::mul;
        int res2=subtract.apply(20,10);
        System.out.println("multiplication is-->"+res2);

    }
}
