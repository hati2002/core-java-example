package inner.com;

class Outer1{
    int a=12;
    String s="abc";
    class Inner{
   void method(){
       System.out.println(s);
       System.out.println(a);
   }
    }
}
public class InnerEx4 {
    public static void main(String[] args) {
//        From inner class we can access all members of outer class
  new Outer1().new Inner().method();
    }
}
