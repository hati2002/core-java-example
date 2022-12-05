package serializable.com;

import java.io.*;

class A implements Serializable{
    int i;
    A(int i){
       this.i=i;
    }
}

class B extends A{
    int j;
    B(int j,int i){
        super(i);
        this.j=j;
    }
}
public class Test {
    public static void main(String[] args) throws IOException {
    B b=new B(12,87);
        System.out.println("the value of i is:"+b.i);
        System.out.println("the value of j is:"+b.j);

        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(b);
        oos.flush();
        oos.close();
        System.out.println("serialisation complete");

        //deserialisation
        try {
            FileInputStream fis=new FileInputStream("abc.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            int b1=ois.read();
            System.out.println(b1);
            fis.close();
            ois.close();
            System.out.println("de-serialise ");
        }
      catch (Exception e){
          System.out.println(e);
      }
    }
}
