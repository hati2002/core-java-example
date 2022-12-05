package inner.com;

public class AicEx2 {
    public static void main(String[] args) {
//        ANONYMOUS INNER CLASS THAT IMPLEMENTS AN INTERFACE
      Runnable r=new Runnable() {
          @Override
          public void run() {
              for (int i=0;i<4;i++){
                  System.out.println("thread");
              }
          }
      };
      Thread t=new Thread(r);
      t.run();
    }
}
