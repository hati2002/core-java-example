import java.util.Random;

public class Flowcontrol {
    public static void main(String[] args) {
      /**  Random r=new Random();
        System.out.println("enter a random number:");
        int num=r.nextInt();

        if (num>0){
            System.out.println("this is positive");
        }
        else {
            System.out.println("nnnn");
        }
        */
        //enhanced statement
       /** String [] s={"A","B","C","D"};
        for (String s1:s){
            System.out.println(s1);
        }

        //string builder
        StringBuilder builder=new StringBuilder("hii");
        builder.append("this is builder");
        System.out.println(builder);

        //string buffer
        StringBuffer buffer=new StringBuffer("hii");
        buffer.append("this is bufgfer");
        System.out.println(buffer);

        //Array
        int [] arr={1,2,3,4,5};
        for (int ar:arr){
            System.out.println(ar);
        }
        */

//        //how to access command line in java program
//        for (String str:args){
//            System.out.println(str);


//            int a=4;
//            int b=a>>1;
//            System.out.println(b);

        //ternary operator
        int day=22;
        String res=(day==10)?"true":"false";
        System.out.println(res);
        }
    }

