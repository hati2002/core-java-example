package javaeaight.com;

import java.util.ArrayList;

interface Test{
    public boolean m(String name);
//    public void add(int a,int b);
}
public class LambdaSinglePara {
    public static void main(String[] args) {
//      Test t=(name)->{
//          System.out.println("hello "+name);
//      };
//      t.m("abc");

      //multiple parameter
//        Test t1=(a,b)->{
//            System.out.println(a+b);
//        };
//        t1.add(10,20);

        //for-each loop
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.forEach((n)-> System.out.println(n));

        //multiple statement
        Test t3=(name)->{
            String str1="hello";
            String str2=str1+name;
            System.out.println(str2);
            return false;
        };
        System.out.println(t3.m("time is precious."));
    }
}
