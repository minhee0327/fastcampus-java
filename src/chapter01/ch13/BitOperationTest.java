package chapter01.ch13;

public class BitOperationTest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);    //xor: 배타 관계 일 경우 true
        System.out.println(~num1);
        System.out.println("------------");
        System.out.println(num1 << 2);
        System.out.println(num1);
        System.out.println(num1 <<= 2);
        System.out.println(num1);

    }
}
