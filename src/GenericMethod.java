import java.util.ArrayList;

public class GenericMethod {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(11);
        a.add(12);
        a.add(13);
        a.add(14);
    m(a);
    }

    private static void m(ArrayList a) {
        a.remove(1);
        a.add(null);
        System.out.println(a);
    }
}
