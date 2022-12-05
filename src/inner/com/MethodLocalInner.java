package inner.com;

class OuterClass1{
    public void method(){              //we can declare a class inside a method
        class Inner{
            public void sum(int a,int b){
                System.out.println("the sum is:"+(a+b));
            }
        }
        Inner i=new Inner();     //We can access method local inner class only within the method
        i.sum(2,3);
        i.sum(10,2);
    }
}

public class MethodLocalInner {
    public static void main(String[] args) {
    new OuterClass1().method();
    }
}
