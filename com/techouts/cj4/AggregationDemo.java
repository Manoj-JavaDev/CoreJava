package com.techouts.cj4;

import java.util.ArrayList;

public class AggregationDemo {

    public static void main(String args[]) {
        Book b1 = new Book("java", 1000);
        Book b2 = new Book("Python", 200);

        ArrayList<Book> listOfBooks = new ArrayList<>();

        listOfBooks.add(b1);
        listOfBooks.add(b2);

        Library lib1 = new Library("KondapurLibrary",listOfBooks);

        for(Book book : lib1.getBooksInLibrary()){
            System.out.println(book.getBookDetails());
        }


    }


}


class  Library {
    String libraryName;
    ArrayList<Book> books ;

    Library(String libraryName, ArrayList<Book> book) {
        this.libraryName = libraryName;
        this.books = book;
    }

    ArrayList<Book> getBooksInLibrary() {
        return this.books;
    }

}

class Book {
    String bookName;
    int bookPrice ;

    Book(String bookName, int bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    String getBookDetails() {
        return "Book Name = " + this.bookName + "\n" + "Book price = " + bookPrice;
    }
}
