package inner.com;

class OuterClass{
    class Inner{
        class Inner1{
            void m(){
                System.out.println("this is Inner1 class method");
            }
        }
    }
}
public class InnerEx6 {
    public static void main(String[] args) {
//        We can declare an inner class inside another inner class (NESTING OF INNER CLASSES)
        new OuterClass().new Inner().new Inner1().m();
    }
}
