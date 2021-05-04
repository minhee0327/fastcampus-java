package chapter02.clone;

import java.util.Arrays;

public class CopyTest {
    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/deep-shallow-lazy-copy-java-examples/
        //Object.clone()은 얕은 복사(기본타입), 깊은 복사(참조타입) 둘 다 있다.

        //primitive type 베얄은 Object.clone() 사용시 deep copy
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();
        System.out.println("----------primitive copy----------");
        System.out.println(Arrays.toString(arr2));
        arr1[0] = 10;
        System.out.println(Arrays.toString(arr2));

        //non primitive type 배열은 Object.clone() 사용시 shallow copy
        //객체 주소만 복제되므로 같은 객체를 참조하게 된다.
        Book[] lib = new Book[5];
        for (int i = 0; i < lib.length; i++) {
            lib[i] = new Book("책" + i, "박완서");

        }
        Book[] lib2 = (Book[]) lib.clone();
        lib[0].setTitle("도서");
        lib[1].setAuthor("주인공");

        System.out.println("---------reference shallow copy-------");
        for (Book b : lib) {
            System.out.println(b.getTitle() + " , " + b.getAuthor());
        }



    }
}
