package chapter02.ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        // https://coding-factory.tistory.com/548
        // 위 자료에서 object.clone() 이 깊은 복사라 하는데 기본타입에서만 가능했다;
        // effective java 에서 clone 사용시 주의하라고 되어있는데, 살펴볼 필요가 있다.
        // https://plas.tistory.com/20
        // 내일 마저 정리하자.
        Book[] deepCopy = library.clone();
        library[0].setAuthor("박완서");
        library[0].setTitle("나목");

        System.out.println("=== library ===");
        for (Book b: library){
            System.out.println(b);
            b.showInfo();
        }
        System.out.println("=== copy library ===");
        for (Book b: deepCopy){
            System.out.println(b);
            b.showInfo();
        }


   }
}
