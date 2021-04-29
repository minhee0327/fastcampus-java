package chapter01.ch16;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        // java v.14 이상
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12->
                31;
            case 2->
                28;
            case 4, 6, 9, 11->
                30;
            default->{
                System.out.println("존재하지 않는 달 입니다.");
                yield -1;
            }
        };

        System.out.println(month +" 월은 " + day +" 입니다.");


    }
}
