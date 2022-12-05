public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] arr=new int[4];
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("arithmetic exception occur");
        }

    }
}
