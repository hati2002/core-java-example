package lambda.exp.com;

interface Student{
     String name(String name);
}

public class LambdaMultiStatement {
    public static void main(String[] args) {

        Student s=(name)->{
            String s1="the name of the student is: ";
            String s2=s1+name;
            return s2;
        };
        System.out.println(s.name("suman"));
    }
}
