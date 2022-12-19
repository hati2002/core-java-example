package lambda.exp.com;

interface Employee{
    public String name(String name);
}
public class LambdaOneArgu {
    public static void main(String[] args) {
        Employee emp=(name)->{

            return "hello "+name;
        };
        System.out.println(emp.name("sss"));
    }
}
