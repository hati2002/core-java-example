package wrapper.com;

public class MyWrapper {
    public static void main(String[] args) {
        Byte b=new Byte((byte) 9);
        System.out.println(b);

        Byte b1=new Byte("67");
        System.out.println(b1);

        Short s=new Short((short) 21);
        System.out.println(s);

        Short s1=new Short("667");
        System.out.println(s1);

        Integer i=new Integer(7);
        System.out.println(i);

        Integer i1=new Integer("2");
        System.out.println(i1);

        Long l=new Long(12);
        System.out.println(l);

        Long l1=new Long("21");
        System.out.println(l1);

        Float f=new Float(2.2f);
        System.out.println(f);

        Float f1=new Float("1.2");
        System.out.println(f1);

        Double d=new Double(1.22d);
        System.out.println(d);

        Double d1=new Double("2.23");
        System.out.println(d1);

        Boolean bln=new Boolean(true);
        System.out.println(bln);

        Boolean bln1=new Boolean("false");
        System.out.println(bln1);

        Boolean bln2=new Boolean("rtg");
        System.out.println(bln2);    //false

        Character c=new Character('a');
        System.out.println(c);

//        Character c1=new Character("vgf"); //C.E
//        System.out.println(c1);
    }
}
