package inner.com;

class Outer{
    class Inner{
        void m(){
            System.out.println("this is inner class method");
        }
    }
}
public class InnerEx3 {
    public static void main(String[] args) {
//        ACCESSING INNER CLASS CODE FROM OUTSIDE OF OUTER CLASS
       new Outer().new Inner().m();
    }
}
