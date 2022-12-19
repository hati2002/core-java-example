package lambda.exp.com;
interface Add{
    public int add(int a,int b);
}
public class LamdaAdd {
    public static void main(String[] args) {

        Add a1=(int a,int b)->{

            return a+b;
        };
        System.out.println(a1.add(10,10));
    }
}
