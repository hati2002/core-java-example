package javaAssesment.com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) throws IOException {
        File f=new File("myfile.txt");
        f.createNewFile();

        FileWriter fw=new FileWriter(f);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter emp name");
        String name= sc.nextLine();
        System.out.println("enter emp id");
        int id= sc.nextInt();
        System.out.println("enter emp salary");
        int salary= sc.nextInt();

        fw.write(name);
        fw.write(id);
        fw.write(salary);

        FileReader fr = new FileReader(f);
        System.out.println(fr.read());
        fr.close();
    }
}







