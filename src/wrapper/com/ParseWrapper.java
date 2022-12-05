package wrapper.com;

public class ParseWrapper {
    public static void main(String[] args) {
        byte b=Byte.parseByte("10");
        System.out.println(b);

        short s=Short.parseShort("111");
        System.out.println(s);

        long l=Long.parseLong("123");
        System.out.println(l);

        int i=Integer.parseInt("22");
        System.out.println(i);

        float f=Float.parseFloat("1.23");
        System.out.println(f);

        double d=Double.parseDouble("5.6");
        System.out.println(d);

        boolean b1=Boolean.parseBoolean("true");
        System.out.println(b1);

        boolean b2=Boolean.parseBoolean("tr");
        System.out.println(b2);

        // parseChar() is not defined for Character wrapper class
    }
}
