package chapter05.ch13;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet <String> set = new TreeSet<>();

        set.add("홍길동");
        set.add("이순신");
        set.add("강감찬");
        set.add("김유신");
        //내부적으로 BST, 정렬되어 출력
        System.out.println(set);
    }
}
