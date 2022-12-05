package serializable.com;

import java.io.*;

class SuperClass{
    int i;
   public SuperClass(int i){
        this.i=i;
    }
    public SuperClass(){
       i=11;
        System.out.println("super class const call");
    }
}

class SubClass extends SuperClass implements Serializable{
    int j;
    public SubClass(int i, int j){
        super(i);
        this.j=j;
    }
}

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    SubClass s=new SubClass(11,20);
        System.out.println("the value of i="+s.i);
        System.out.println("the value of j="+s.j);
        //serialize
        FileOutputStream fos=new FileOutputStream("xyz.com");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        System.out.println("the obj has been serialize");

        //deserialize
        FileInputStream fis=new FileInputStream("xyz.com");
        ObjectInputStream ois=new ObjectInputStream(fis);
        SubClass s1= (SubClass) ois.readObject();
        ois.close();
        System.out.println("the obj has been deserialize");
        System.out.println(s1.i);
        System.out.println(s1.j);
    }
}
