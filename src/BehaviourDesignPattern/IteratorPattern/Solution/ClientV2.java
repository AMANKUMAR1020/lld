package BehaviourDesignPattern.IteratorPattern.Solution;

import java.util.Iterator;

public class ClientV2 {

    public ClientV2(){
        System.out.println("This is ClientV2 Constructor");
    }

    public void execute() {        BookCollectionV2 bookCollection = new BookCollectionV2();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("Python Book"));

        Iterator<Book> iterator = bookCollection.createIterator();
        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
