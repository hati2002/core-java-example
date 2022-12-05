package wrapper.com;

public class AutoWidening {
    static void m1(Integer i){
        System.out.println("integer wrapper type");
    }
    static void m1(Long l){
        System.out.println("long wrapper type");
    }
    public static void main(String[] args) {
     int i=22;
      m1(11);
    }
}
