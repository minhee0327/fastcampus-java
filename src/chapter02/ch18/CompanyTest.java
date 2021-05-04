package chapter02.ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        System.out.println(company1);

        Company company2 = Company.getInstance();
        System.out.println(company2);

        //단일 인스턴스만 생성되기 때문에 같은 jvm 주소 찍는다.
        //Singleton Pattern 대표 Class: Calender
        Calendar calendar = Calendar.getInstance();

    }
}
