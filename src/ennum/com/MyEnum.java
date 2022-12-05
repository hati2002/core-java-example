package ennum.com;

enum month{
    Jan, Feb, Mar,Apr,May,Jun,Jul,Aug,Sep;
}

//enum cost{
//    Silver, Gold, Platinum, Diamond;
//}

public class MyEnum {
    public static void main(String[] args) {
//       month m=month.Jun;
//        System.out.println(m);

     /**   cost c=cost.Platinum;
        switch (c){
            case Gold:
                System.out.println(10000);
                break;
            case Silver:
                System.out.println(9000);
                break;
            case Platinum:
                System.out.println(8000);
                break;
            case Diamond:
                System.out.println(20000);
                break;
            default:
                System.out.println("high cost");
        }
      */

     //values() method
        month[] mon=month.values();
        for (month m:mon){
//            System.out.println(m);
            System.out.println(m+"---> "+m.ordinal());  //ordinal() method returns the position
        }
    }
}
