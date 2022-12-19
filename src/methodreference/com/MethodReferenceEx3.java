package methodreference.com;

import java.util.function.BiFunction;

class Arithmetic{
    public static int add(int a,int b){
        return a+b;
    }

    public static float add(int a,float b){
        return a+b;
    }

    public static float add(float a,float b){
        return a+b;
    }

    public static String add(int a,String s){
        return a+s;
    }
}
public class MethodReferenceEx3 {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> bf=Arithmetic::add;
        System.out.println(bf.apply(10,20));

        BiFunction<Integer,Float,Float> bf1=Arithmetic::add;
        System.out.println(bf1.apply(10,2.3f));

        BiFunction<Float,Float,Float> bf3=Arithmetic::add;
        System.out.println(bf3.apply(15.2f,3.3f));

        BiFunction<Integer,String,String> bf4=Arithmetic::add;
        System.out.println(bf4.apply(23,"sss"));
    }
}
