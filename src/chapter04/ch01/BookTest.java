package chapter04.ch01;

import java.util.Objects;

class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ',' + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("데미안", "헤르만 헤세");
        Book book2 = new Book("데미안", "헤르만 헤세");

        System.out.println(book == book2);
        System.out.println(book.equals(book2));

        String str = new String("test");

    }
}

