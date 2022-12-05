package inner.com;

class OuterClass2{
    int a=12;
    String s="abcd";
    public void method(){
        class Inner{
        public void m(){
            System.out.println(a);
            System.out.println(s);
        }
        }
        Inner i=new Inner();
        i.m();
    }
}

public class MliEx2 {
    public static void main(String[] args) {
    new OuterClass2().method();
    }
}
// If we are declaring inner class inside instance method then we can access both static and non static members of outer class directly
//But if we are declaring inner class inside static method then
//      we can access only static members of outer class directly and we can't access instance members directly.