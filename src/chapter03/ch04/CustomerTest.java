package chapter03.ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int price  = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        price  = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + price);
        System.out.println("-----------");

        Customer vc = new VIPCustomer(12345, "noname");
        price = vc.calcPrice(1000); //항상 인스턴스의 메서드가 호출됩니다. (가상메서드)
        System.out.println(vc.showCustomerInfo() + price);
    }
}
