package inner.com;

class StaticOuter{
   static class Inner{
       public static void main(String[] args) {
           System.out.println("this is inner class main func");
       }
    }

    public static void main(String[] args) {
        System.out.println("this is outer class main func");
    }
}

public class AicEx5 {
    public static void main(String[] args) {

    }
}
