package BehaviourDesignPattern.IteratorPattern.Solution;

import java.util.Iterator;

public class ClientV3 {

    public ClientV3(){
        System.out.println("This is ClientV3 Constructor");
    }

    public void execute() {
        BookCollectionV3 bookCollection = new BookCollectionV3();
        bookCollection.addBook(new Book("Python Book"));
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Java Book"));

        Iterator<Book> iterator = bookCollection.iterator(); //Standardized

        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}