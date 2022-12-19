package methodreference.com;

interface Interface{
    void say();
}
public class MethodReferenceEx1 {

    public static void method(){
        System.out.println("this is a static method");
    }
    public static void m(){
        System.out.println("this is another method");
    }
    public static void main(String[] args) {

        Interface obj=MethodReferenceEx1::method;
        obj.say();

//        Interface obj1=MethodReferenceEx1::m;
//        obj1.say();
    }
}
