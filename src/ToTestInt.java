
interface Text{
    void square();
}

class Arithmetic implements Text{
     public void square(){
        System.out.println("this is ");
    }
}
public class ToTestInt{
    public static void main(String[] args) {
        Arithmetic a=new Arithmetic();
        a.square();
    }
}
