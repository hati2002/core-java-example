package wrapper.com;

public class ValueOfWrapper {
    public static void main(String[] args) {
//        A valueOf() method with primitive type as an argument
     /**   Byte b=Byte.valueOf((byte) 123);
        System.out.println(b);

        Short s=Short.valueOf((short) 12);
        System.out.println(s);

        Long l=Long.valueOf(32);
        System.out.println(l);

        Integer i=Integer.valueOf(33);
        System.out.println(i);

        Float f=Float.valueOf((float) 1.2);
        System.out.println(f);

        Double d=Double.valueOf(2.2);
        System.out.println(d);

        Boolean bln=Boolean.valueOf("true");
        System.out.println(bln);

        Boolean bln1=Boolean.valueOf("tru");
        System.out.println(bln1);

        Character c=Character.valueOf('A');
        System.out.println(c);
        */
//        valueOf() Method with string as an argument :
      /**  Byte b=Byte.valueOf("12");
        System.out.println(b);

        Short s=Short.valueOf("32");
        System.out.println(s);

        Long l=Long.valueOf("100");
        System.out.println(l);

        Integer i=Integer.valueOf("200");
        System.out.println(i);

        Float f=Float.valueOf("2.5");
        System.out.println(f);

        Double d=Double.valueOf("9.7");
        System.out.println(d);

        Boolean bln=Boolean.valueOf("true");
        System.out.println(bln);

        Boolean bln1=Boolean.valueOf("tru");
        System.out.println(bln1);

//        Character c=Character.valueOf("A");
//        System.out.println(c);
       */

      /**
//        valueOf() Method with string and int as an arguments
        Byte b=Byte.valueOf("100",2);
        System.out.println(b);
        Byte b1 = Byte.valueOf("43", 5);
        System.out.println(b1);

        Short s=Short.valueOf("10243",8);    //A number with base 8 is converted into decimal value
        System.out.println(s);
        Short s1=Short.valueOf("1023",10);
        System.out.println(s1);

        Integer i=Integer.valueOf("12A",12);
        System.out.println(i);
        Integer i1=Integer.valueOf("12AB",16);
        System.out.println(i1);

        Long l=Long.valueOf("A123BGH",36);
        System.out.println(l);
       */

//        xxxValue Methods Of Wrapper Classes
        Double d=new Double(1.234);
        System.out.println(d.byteValue());
        System.out.println(d.doubleValue());
        System.out.println(d.floatValue());
        System.out.println(d.intValue());
        System.out.println(d.longValue());
        System.out.println(d.shortValue());
    }
}
