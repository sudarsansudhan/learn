package paritces;

import java.util.ArrayList;

public class Book {
    String title;
    String author;
    String ISBN;

    private  static ArrayList<Book> bookCollection =new ArrayList<>();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static ArrayList<Book> getBookCollection() {
        return bookCollection;
    }

    public static void setBookCollection(ArrayList<Book> bookCollection) {
        Book.bookCollection = bookCollection;
    }

    public static void add_book(Book book){
        bookCollection.add(book);
    }
    public static void remove_book(Book book){
        bookCollection.remove(book);
    }

    public static void main(String[] args) {
        Book book1=new Book("this is a book","Deenis recihed","876543");
        Book book2=new Book("this a second book","sudarsnndksnds","232323");
        Book.add_book(book1);
        Book.add_book(book2);
        ArrayList<Book>bookcollection =Book.getBookCollection();
        System.out.println("List of books:");
        for (Book book: bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
        Book.remove_book(book1);
        System.out.println("\nAfter removing " + book1.getTitle() + ":");
        System.out.println("List of books:");
        for (Book book: bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }

}
