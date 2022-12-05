package inner.com;

class StaticInner {
   static class Inner {
        public void m1() {
            System.out.println("this is inner class method");
        }
    }
}

public class AicEx4 {
    public static void main(String[] args) {
    StaticInner.Inner si=new StaticInner.Inner();
    si.m1();
    }
}
