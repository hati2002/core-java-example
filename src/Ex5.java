
class Box{
int len;
int b;
int h;
    Box(int len,int b,int h){
        this.len=len;
        this.b=b;
        this.h=h;
    }
    void area(){
        int ar=len*b;
        System.out.println(ar);
    }
}

class Box3d extends Box{

    Box3d(int len, int b, int h) {
        super(len, b, h);
    }
    void volume(){
        int v=len*b*h;
        System.out.println(v);
    }
}
public class Ex5 {
    public static void main(String[] args) {
     Box3d b=new Box3d(2,3,4);
     b.volume();
     b.area();
    }
}
