package chapter01.ch12;

public class LogicalTest {
    public static void main(String[] args) {

        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10 && ((i = i+1) <10));

        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);  // not 4 (shortest circuit evaluation)



    }
}
