package javaeaight.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;

    Product(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class StreamExample {
    public static void main(String[] args) {
        List<Product> plist=new ArrayList<Product>();
        plist.add(new Product(121,"pen",10));
        plist.add(new Product(122,"pencil",15));
        plist.add(new Product(123,"laptop",50000));
        plist.add(new Product(124,"T.V",10000));
        plist.add(new Product(125,"Apple",3000000));

//        List<Float> pprice=new ArrayList<Float>();
//        for (Product p:plist){
//               if (p.price<50000){
//                   pprice.add(p.price);
//               }
//        }
//        System.out.println(pprice);

//    using stream
        List<Float> prodprice=plist.stream()
                .filter(p->p.price<60000)
                .map(p->p.price)
                .collect(Collectors.toList());
        System.out.println(prodprice);

        //reduce()
        Float totalPrice=plist.stream()
                .map(p->p.price)
                .reduce(0.0f,(sum,price)->sum+price);   // accumulating price
        System.out.println(totalPrice);

        //for each
        plist.forEach(System.out::println);

        //for each order
        plist.stream().forEachOrdered(price-> System.out.println(price));

    }
}
