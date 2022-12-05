package inner.com;

public class AicEx3 {
    public static void main(String[] args) {
//        ANONYMOUS INNER CLASS THAT DEFINE INSIDE METHOD ARGUMENTS
        new Thread(new Runnable() {
            @Override
            public void run() {
            for (int i=0;i<4;i++){
                System.out.println(i);
            }
            }
        }).start();
    }
}
