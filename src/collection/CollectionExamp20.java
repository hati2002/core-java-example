package collection;

import java.util.*;

public class CollectionExamp20 {
    public static Map<String,String> getData(){
        Map<String,String> m=new HashMap<>();
        String[][] data ={{"wb","kolkata"},{"odisha","Bhubaneswar"},{"tamilnadu","chennai"},{"karanataka","bengaluru"}};
        for (int i=0;i< data.length;i++){
         m.put(data[i][0],data[i][1]);
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,String> capital=getData();
        System.out.println("enter state");
        String s= sc.nextLine();
        if (capital.get(s)!=null){

            System.out.println(s+"||"+capital.get(s));
        }
  }
}
