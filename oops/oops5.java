package oops;

import java.util.ArrayList;

public class oops5 {
    static class Book {
        String title;
        String author;
        String isbn;

        public static ArrayList<Book> colection = new ArrayList<Book>();

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;

        }

        public String get_Title() {
            return title;
        }

        public String get_Author() {
            return author;
        }

        public String get_ISBN() {
            return isbn;
        }

        public static void add_Book(Book book) {
            colection.add(book);
        }

        public static void remove_Book(Book book) {
            colection.remove(book);
        }

        public static ArrayList<Book> get_Collection() {
            return colection;
        }
    }

    public static void main(String args[]) {
        Book one = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
        Book two = new Book("An Introduction to c++", "Guido van Rossum", "9355423489");

        Book.add_Book(one);
        Book.add_Book(two);
        ArrayList<Book> bookCollection = Book.get_Collection();
        System.out.println("List of books:");

        // for each loop is used here
        for (Book book : bookCollection) {
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }
        Book.remove_Book(one);
        System.out.println("\nAfter removing " + one.get_Title() + ":");
        System.out.println("List of books:");
        for (Book book : bookCollection) {
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }
    }
}
