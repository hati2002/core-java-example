
class Gen<T>{
    T obj;
    Gen(T obj){
        this.obj=obj;
    }
    public void show(){
        System.out.println("the type of object is"+obj.getClass());
    }

    public T getObj() {
        return obj;
    }
}

public class GenericEx {
    public static void main(String[] args) {
        Gen g=new Gen(76);
        g.show();
        System.out.println(g.getObj());

        Gen g1=new Gen("ss");
        g1.show();
        System.out.println(g1.getObj());

    }
}
