package methodreference.com;


interface Inter{
    void method();
}
public class ReferInstanceMethod {

    public void m(){
        System.out.println("this is a non static method");
    }
    public static void main(String[] args) {

//        ReferInstanceMethod rm=new ReferInstanceMethod();
//        Inter in=rm::m;
//        in.method();

        Inter obj=new ReferInstanceMethod()::m;
        obj.method();
     }
}
