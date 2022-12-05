package inner.com;

class Outer2{
    int a=20;
    class Inner{
        int a=200;
        public void meth(){
            int a=2000;
            System.out.println(a);
            System.out.println(this.a);         //Within the inner class "this" always refers current inner class object
            System.out.println(Outer2.this.a);   //To refer current outer class object we have to use "outer class name.this"
        }
    }
}

public class InnerEx5 {
    public static void main(String[] args) {
    new Outer2().new Inner().meth();
    }
}
