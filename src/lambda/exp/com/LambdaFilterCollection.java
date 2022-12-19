package lambda.exp.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product1{
    int id;
    String name;

    Product1(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class LambdaFilterCollection {
    public static void main(String[] args) {

        List<Product1> list=new ArrayList<>();
        list.add(new Product1(101,"pen"));
        list.add(new Product1(201,"book"));
        list.add(new Product1(301,"pencil"));

        //using stream you can filter the data
        Stream<Product1> filterData=list.stream().filter(p->p.id>101);

        filterData.forEach(product -> System.out.println(product.id));
    }
}
