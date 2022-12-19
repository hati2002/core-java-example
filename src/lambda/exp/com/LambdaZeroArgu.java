package lambda.exp.com;

interface Animal{
    public String sound();
}
public class LambdaZeroArgu {
    public static void main(String[] args) {

        Animal a=()->{
            return "nothing will return";
        };
        System.out.println(a.sound());
    }
}
