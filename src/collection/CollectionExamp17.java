package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionExamp17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the reg number:");
        int reg1= sc.nextInt();
        int reg2= sc.nextInt();
        int reg3= sc.nextInt();

        System.out.println("enter the marks:");
        int mark1= sc.nextInt();
        int mark2= sc.nextInt();
        int mark3= sc.nextInt();

        HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
        hm.put(reg1,mark1);
        hm.put(reg2,mark2);
        hm.put(reg3,mark3);
        System.out.println(hm);

        HashMap<String,Integer> hm1=new HashMap<String,Integer>();
        Iterator<Integer> itr=hm.keySet().iterator();
        while (itr.hasNext()){
            int regd=itr.next();
            int mark=hm.get(regd);
            if (mark>=90){
                hm1.put("gold",regd);
            } else if (mark>=80 && mark<90) {
                hm1.put("silver",regd);
            } else if (mark>=70 && mark<80) {
                hm1.put("Bronze",regd);
            }
        }
        System.out.println(hm1);
    }
}
