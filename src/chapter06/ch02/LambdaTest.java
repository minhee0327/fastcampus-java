package chapter06.ch02;

public class LambdaTest {
    public static void main(String[] args) {
        Add add1 = (x, y) -> {return x+y;};
//        Add add2 = (x, y) -> x+y;
        System.out.println(add1.add(1,4));
//        System.out.println(add2.add(1,4));

    }
}
