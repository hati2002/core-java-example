package inner.com;

public class NormalInner {
    class Inner1{
     void m(){
         System.out.println("this is inner class method");
     }
    }
    public static void main(String[] args) {
        //to access inner class object
        System.out.println("this is main class");
        new NormalInner().new Inner1().m();
    }
}
