package lambda.exp.com;

interface Calculator{
    public int addition(int a,int b);
}
public class LambdaMultiArgu {
    public static void main(String[] args) {

        Calculator c = (int a, int b) -> {

            return a + b;
        };
    }
}
