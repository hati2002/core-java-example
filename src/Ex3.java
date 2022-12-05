
class CellPhone{     //ex1
   void cont1(){
       System.out.println("8765432");
   }
    void cont2(){
        System.out.println("768976543");
    }
}
class Cont extends CellPhone{
    void contact(){
        System.out.println("here is two contact number");
    }
}
public class Ex3 {
    public static void main(String[] args) {
        Cont c = new Cont();
        c.cont1();
        c.cont2();
    }
}
