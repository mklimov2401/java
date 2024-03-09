package ru.klimov.java.course.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class BookArrayListTest1 {
    public static void main(String[] args) {
        Book2 book1 = new Book2("book1", "author1");
        Book2 book2 = new Book2("book2", "author2");
        Book2 book3 = new Book2("book2", "author2");
        List<Book2> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        System.out.println(books);
        books.remove(book3);
        System.out.println(books);
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
