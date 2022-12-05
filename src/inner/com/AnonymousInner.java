package inner.com;

class Book{
  public void Price(){
      System.out.println("the price is 200");
  }
}

public class AnonymousInner {
    public static void main(String[] args) {
  Book b=new Book(){
      public void Price(){
          System.out.println("the price is 250");
      }
  };
  b.Price();
  Book b1=new Book();
  b1.Price();
    }
}
