package chapter02.ch21;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        for(Book b: library){
            System.out.println(b);
        }

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        for (Book b: library){
            System.out.println(b);
            b.showInfo();
        }
    }
}