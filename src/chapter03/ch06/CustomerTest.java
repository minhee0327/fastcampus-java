package chapter03.ch06;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerT = new Customer(100010, "Thomas");
        Customer customerJ = new Customer(100020, "James");
        Customer customerE = new GoldCustomer(100030, "Edward");
        Customer customerP = new GoldCustomer(100040, "Percy");
        Customer customerK = new VIPCustomer(100050, "Kim");

        customerList.add(customerT);
        customerList.add(customerJ);
        customerList.add(customerE);
        customerList.add(customerP);
        customerList.add(customerK);

        for(Customer customer: customerList){
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;

        for(Customer customer: customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() +" 님이 " + cost + "원 지불하셨습니다." );
            System.out.println(customer.getCustomerName() +" 님의 현재 보너스 포인트는 " + customer.bonusPoint + " 입니다.");
        }
        System.out.println("============");
        if(customerE instanceof GoldCustomer){
            GoldCustomer gc = (GoldCustomer) customerE;
            System.out.println(gc.showCustomerInfo());
        }
    }
}
