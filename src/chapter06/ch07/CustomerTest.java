package chapter06.ch07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer("이순신", 40, 100);
        Customer customerKim = new Customer("김유신", 20, 100);
        Customer customerHong = new Customer("홍길동", 13, 50);

        List<Customer> list = new ArrayList<>();
        list.add(customerLee);
        list.add(customerKim);
        list.add(customerHong);

        //1. 고객명단 출력하기
        list.forEach(s -> System.out.println(s.getName()));
        list.stream().map(s->s.getName()).forEach(s -> System.out.println(s));

        //2. 여행 총 비용 계산
        int totalCost = list.stream().mapToInt(c->c.getCost()).sum();
        System.out.println(totalCost);

        //3. 고객 중 20세 이상인 사람 이름 정렬하여 출력
        list.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(c-> System.out.println(c));

    }
}
