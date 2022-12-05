class Animal{
    public void leg(){
        System.out.println("animal has 4 legs");
    }
}

class Dog extends Animal{
    public void ear(){
        System.out.println("it has 2 ear");
    }
}

class cat extends Animal{
    public void sound(){
        System.out.println("it makes meu meu ");
    }
}
public class poly {
    public static void main(String[] args) {
//        Animal a=new Animal();
//        a.leg();

        cat c=new cat();
        c.sound();
    }
}
