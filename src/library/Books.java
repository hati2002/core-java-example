package library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Books {

    List<Book> books=new ArrayList<Book>();

    Books(){
        addBook(new Book("abc",2002,200));
        addBook(new Book("xyz",2005,700));
        addBook(new Book("mno",2010,500));
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(){
        Iterator<Book> itr=books.listIterator();
        while (itr.hasNext()){
            Book book=itr.next();
            if (book.getName().equals("abc")){
              itr.remove();
            }
        }
    }

    public void updateBook(){
        ListIterator<Book> itr2=books.listIterator();
        while (itr2.hasNext()){
            Book book=itr2.next();
            if (book.getName().equals("abc")){
                  book.setName("gjfj");
            }

        }
    }
    public static void main(String[] args) {
     Books b=new Books();
//     for (Book b1:b.books){
//         System.out.println(b1);
//     }

//        //after removing
//     b.removeBook();
//     for (Book b1: b.books){
//         System.out.println(b1);
//     }

        //after updating
     b.updateBook();
        for (Book b1: b.books){
            System.out.println(b1);
        }
    }
}
