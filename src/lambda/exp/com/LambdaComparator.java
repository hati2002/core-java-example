package lambda.exp.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
    int id;
    int price;
    String name;
     Product(int id,int price,String name){
        this.id=id;
        this.price=price;
        this.name=name;
    }
}

public class LambdaComparator {
    public static void main(String[] args) {

        List<Product> l=new ArrayList<>();
        l.add(new Product(12,100,"asd"));
        l.add(new Product(13,300,"abc"));
        l.add(new Product(15,500,"xyz"));

        Collections.sort(l,( p1, p2)->{
            return p1.name.compareTo(p2.name);
        });
        for(Product p:l){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
    }
}
