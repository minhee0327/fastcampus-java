package chapter02.ch23;

import chapter02.ch21.Book;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();

        for(int i = 1; i <= 5; i ++){
            list.add(new Book("태백산맥" + i, "조정래"));
        }

        for(int i = 0; i < list.size(); i++){
            list.get(i).showInfo();
        }
    }
}
