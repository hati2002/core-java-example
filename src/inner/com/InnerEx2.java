package inner.com;

public class InnerEx2 {
class  Inner{
    void m(){
        System.out.println("this is inner class method");
    }
}
void m1(){
Inner i=new Inner();
i.m();
}
    public static void main(String[] args) {
//        ACCESSING INNER CLASS CODE FROM INSTANCE AREA OF OUTER CLASS
     InnerEx2 i2=new InnerEx2();
     i2.m1();
    }
}
