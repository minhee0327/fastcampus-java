package chapter06.ch04;

public class StringConcatTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

//        StringConcatImpl strImpl = new StringConcatImpl();
//        strImpl.makeString(s1, s2);

        // 내부적으로 anonymous class 가 만들어짐
        StringConcat concat = (x, y) -> {
            System.out.println(x+" , "+y);
        };

        concat.makeString(s1, s2);

        StringConcat concat2  = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 +"..." + s2);
            }
        };

        concat2.makeString(s1, s2);
    }
}
