package javaeaight.com;
  interface Drawable{
       void draw();
//      int l=20;
  }
public class LambdaExpression {
    public static void main(String[] args) {
        int l=10;
        //without lambda expression
        Drawable d=new Drawable() {
            @Override
            public void draw() {
                System.out.println(l);
            }
        };
        d.draw();

        //with lambda expression
        Drawable d1=()->{
            System.out.println(l);
        };
        d1.draw();
    }
}
