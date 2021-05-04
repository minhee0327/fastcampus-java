package chapter03.ch15;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.sell();
        customer.buy();
        customer.order();
        customer.hello();

        Buy buyer = new Customer();
        buyer.buy();
        buyer.order();

        Sell seller = new Customer();
        seller.sell();
        seller.order();
    }
}
