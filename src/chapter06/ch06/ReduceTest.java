package chapter06.ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        return s1.getBytes().length>=s2.getBytes().length? s1: s2;    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~", "hello", "Good Morning", "반갑습니다^^"};
        //처음에 단순히 length 로 비교했는데, getBytes()로 encoding 해서 비교한 것으로 변환했다. (이유: 영문(1byte), 한글(2byte) 이기 때문)
        String str1 = Arrays.stream(greetings).reduce("", (s1,s2)->{return s1.getBytes().length>=s2.getBytes().length? s1: s2;});
        System.out.println(str1);

        String str2 = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str2);
    }
}

