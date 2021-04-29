package chapter01.ch13;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {
        int max;
        System.out.println("두 수를 입력 받아 더 큰 수를 출력해주세요. \n");

        Scanner sc = new Scanner(System.in);
        System.out.println("입력 1: ");
        int num1 = sc.nextInt();
        System.out.println("입력 2: ");
        int num2 = sc.nextInt();

        max = (num1 > num2)? num1: num2;
        System.out.println(max);
    }
}
