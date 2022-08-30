package sky.pro.homework.hw19_110;

import java.util.Arrays;
import java.util.Objects;

public class Library {

    private Book[] books;

    public Library(int lenMass) {
        books = new Book[lenMass];
    }

    public Library(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        Book[] newBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[books.length] = book;
        books = newBooks;
    }

    public void printBooks() {
        Arrays.stream(books).forEach(System.out::println);
    }

    public void printBookByName(String bookName) {
        Arrays.stream(books)
                .filter(book -> book.getName().equals(bookName))
                .forEach(book -> System.out.println(book.stringBookToPrint()));
    }

    public void changeYearPublicationByName(String bookName, int newYearPublication) {
        Arrays.stream(books)
                .filter(book -> book.getName().equals(bookName))
                .forEach(book -> book.setYearPublication(newYearPublication));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("Library:");
        Arrays.stream(books)
                .filter(Objects::nonNull)
                .forEach(book -> sb
                        .append("\nBook: ")
                        .append(book)
                );
        return sb.toString();
    }
}
