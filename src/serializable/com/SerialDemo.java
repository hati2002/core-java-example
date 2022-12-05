package serializable.com;

import java.io.*;

public class SerialDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

       Save obj=new Save();
       obj.i=4;

        File f=new File("demo.txt");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Save obj1= (Save) ois.readObject();

        System.out.println("value of obj1:"+obj1.i);
    }
}

class Save implements Serializable{
    int i;
}