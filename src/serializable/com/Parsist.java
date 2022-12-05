package serializable.com;

import java.io.*;

class Employee implements Serializable{    //interface
    int id;
    String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}

public class Parsist {
    public static void main(String[] args) {
  //serialise
        Employee emp1=new Employee(121,"abc");
        Employee emp2=new Employee(122,"xyz");
        Employee emp3=new Employee(123,"def");
        try {
            FileOutputStream fos=new FileOutputStream("out.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            oos.writeObject(emp1);
            oos.writeObject(emp2);
            oos.writeObject(emp3);
            oos.flush();
            oos.close();
            System.out.println("serialization ");
        }
        catch (Exception e){
            System.out.println(e);
        }

        //deserialise
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("out.txt"));
            Employee e1= (Employee) ois.readObject();
            Employee e2= (Employee) ois.readObject();
            Employee e3= (Employee) ois.readObject();
            System.out.println(e1.id+"--->"+e1.name);
            System.out.println(e2.id+"--->"+e2.name);
            System.out.println(e3.id+"--->"+e3.name);
        }
      catch (Exception e){
          System.out.println(e);
      }
    }
}
