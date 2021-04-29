package chapter02.ch07;

public class Order {
    long orderNum;
    long orderPhoneNum;
    String orderAddress;
    int orderDate;
    int orderTime;
    int orderPrice;
    String menuNum;

    public Order(long orderNum, long orderPhoneNum, String orderAddress, int orderDate,
                 int orderTime, int orderPrice, String menuNum) {
        this.orderNum = orderNum;
        this.orderPhoneNum = orderPhoneNum;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuNum = menuNum;
    }

    public void showInfo(){
        System.out.println("주문 접수 번호: " + this.orderNum);
        System.out.println("주문 핸드폰 번호: " + this.orderPhoneNum);
        System.out.println("주문 집 주소: " + this.orderAddress);
        System.out.println("주문 날짜: " + this.orderDate);
        System.out.println("주문 시간: " + this.orderTime);
        System.out.println("주문 가격: " + this.orderPrice);
        System.out.println("메뉴 번호: " + this.menuNum);
    }
}
