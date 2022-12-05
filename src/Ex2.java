
class Shop1{
    void variant(String s){
        System.out.println("jeans available");
    }
}

class Shop2 extends Shop1{
    void variant(){
        System.out.println("variant of jeans available");
    }
}
public class Ex2 {
    public static void main(String[] args) {
       Shop1 s=new Shop1();
       s.variant("sam");
        Shop2 s2=new Shop2();
        s2.variant();
    }
}
