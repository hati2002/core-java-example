package iofile.com;


import java.io.*;

public class IoEx1 {
    public static void main(String[] args) throws IOException {
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
//        A java file Object can represent directories also
/**
        File f1=new File("xyz");
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

        //Write code to create a directory named with Java
        // in current working directory and create a file named with abc.txt in that directory.
      /**  File f2=new File("java");
        f2.mkdir();
        File f3=new File("java","abc.txt");
        f3.createNewFile();

       */
        //file writer
        File ff=new File("abc.txt");
        System.out.println(ff.exists());
        FileWriter fw=new FileWriter(ff,true);
        System.out.println(ff.exists());
        fw.write(11);
        fw.close();

        //buffer writer
        FileWriter fw1=new FileWriter("abc.txt");
        BufferedWriter bw=new BufferedWriter(fw1);
        bw.write("hello");
        bw.close();
        System.out.println("success");

        //buffer reader
        FileReader fr=new FileReader("abc.txt");
        BufferedReader br=new BufferedReader(fr);
//        br.read();
        String s= br.readLine();
        while (s!=null){
            System.out.println(s);
            s= br.readLine();
        }
        br.close();

        //print writer
        FileWriter fwr=new FileWriter("abc.txt");
        PrintWriter pw=new PrintWriter(fwr);
        pw.write(12);
        pw.write("sss");
        pw.flush();
        pw.close();
    }
}
