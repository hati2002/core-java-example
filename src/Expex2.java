import java.io.IOException;

public class Expex2 {
    public static void main(String[] args) {
            int[] arr=new int[5];
            arr[0]=1;
            arr[1]=4;
            try {
                System.out.println(arr[10]);
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException a){
                System.out.println("this is ArrayIndexOutOfBoundsException");
            }
            catch (Exception i){
                System.out.println("exception");
            }
            finally {
                System.out.println("end of the program");
            }
    }
}
