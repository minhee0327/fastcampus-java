package chapter05.ch13;

import java.util.*;

class Test implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>(new Test());
        ts.add("user5");
        ts.add("user3");
        ts.add("user4");
        ts.add("user2");
        ts.add("user1");

//         Treeset 의 Comparator 사용시에는 위처럼 class 에 implements 받아 구현한 후, 생성자로 넣어준다.
//         list 의 Comparator 사용시에는 아래처럼 Comparator 객체 생성해서 구현해서 사용한다.

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        for(String s: ts){
            System.out.println(s);
        }
    }
}
