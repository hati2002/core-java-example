package iofile.com;


import java.io.File;
import java.io.IOException;

public class IoEx1 {
    public static void main(String[] args)  {
      /**  File f=new File("abc.text");    //if abc.text file is available then it return true otherwise false
        System.out.println(f.exists());
        try {
            f.createNewFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(f.exists());
       */

      /**
      File f=new File("xyz");
        System.out.println(f.exists());
        f.mkdir();                    //returns true if dictionary is created otherwise false
        System.out.println(f.exists());
       */

//      File f=new File("abc","xyz");
//        System.out.println(f.exists());
//        f.mkdir();
//        System.out.println(f.exists());

//        File f=new File("abc.text","xyz");
//        System.out.println(f.exists());
//        f.mkdir();
//        System.out.println(f.exists());
    }
}
