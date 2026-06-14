package BehaviourDesignPattern.IteratorPattern.Solution;


public class ClientV1 {

    public ClientV1(){
        System.out.println("This is ClientV1 Constructor");
    }

    public void execute() {
        BookCollectionV1 bookCollection = new BookCollectionV1();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("Python Book"));

        for(int i=0;i<bookCollection.getBooks().size();i++){
            System.out.println(bookCollection.getBooks().get(i));
        }
    }
}