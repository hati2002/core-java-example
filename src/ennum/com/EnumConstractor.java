package ennum.com;

enum store{
    book(200),pen(10),pencil(10),notebook;
int price;
    store(int price) {
  this.price=price;
        System.out.println("this is parameterize cons");
    }

    store(){
        this.price=300;
        System.out.println("this is default cons");
    }

    public int getPrice() {
        return price;
    }
}
public class EnumConstractor {
    public static void main(String[] args) {
  store[] s=store.values();
  for (store s1:s){
      System.out.println(s1+"-->"+s1.getPrice());
  }
    }
}
