package collection.map;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);

        //pop
//        s.pop();
//        System.out.println(s);

        //peek
//        System.out.println(s.peek());

        //search
        System.out.println(s.search(2));

        //empty
        System.out.println(s.empty());
    }
}
