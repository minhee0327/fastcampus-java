package chapter06.ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //enhanced for
        for (int num: arr){
            System.out.println(num);
        }
        System.out.println();
        //stream
//        Arrays.stream(arr).forEach(x-> System.out.println(x));

        //한 번 사용한 stream 은 재사용 불가
        IntStream is = Arrays.stream(arr);
//        is.forEach(x-> System.out.println(x));

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
