package methodreference.com;

import java.util.function.Function;

interface MyInter{
    Student getName(String name);
}
public class ConstructorReference {
    public static void main(String[] args) {
     MyInter mi=Student::new;

     //refer constructor
        Function<String,Student> f=Student::new;
        Function<String,Student> f1=name->new Student(name);

        System.out.println(mi.getName("suman"));
        System.out.println(f.apply("suman").getName());
    }
}
