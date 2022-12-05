interface Shape{

}
class Circle implements Shape{
      public void area(int red){
          System.out.println("the area is:"+3.14*red*red);
      }
      public void perimeter(int red){
          System.out.println("the perimeter is:"+2*3.14*red);
      }
}
class Rectangle implements Shape{
    public void area(int len,int b){
        System.out.println("the area is:"+len*b);
    }
    public void perimeter(int len,int b){
        System.out.println("the perimeter is:"+2*(len+b));
    }
}
class Square implements Shape{
    public void area(int len){
        System.out.println("area is:"+ len*len);
    }
    public void perimeter(int len){
        System.out.println("perimeter is:"+ 4*len);
    }
}
public class Ex1 {
    public static void main(String[] args) {
//      Circle c=new Circle();
//      c.area(2);
//
//        Rectangle r=new Rectangle();
//        r.area(4,2);
//        r.perimeter(4,2);
//
//        Square s=new Square();
//        s.area(4);
//        s.perimeter(4);
    }
}
