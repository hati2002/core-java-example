package javaAssesment.com;

interface Animal{
     void sound();
}

public class Ques3 {
    public static void main(String[] args) {
        Animal a=new Animal(){
            public void sound(){
                System.out.println("hhggtt");
            }
        };
        a.sound();
    }
}
