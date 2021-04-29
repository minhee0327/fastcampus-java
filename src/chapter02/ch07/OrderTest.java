package chapter02.ch07;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(202011020003L, 01023450001, "경기도 용인시"
        , 20210428, 130258, 35000, "0003");

        order1.showInfo();
    }
}
