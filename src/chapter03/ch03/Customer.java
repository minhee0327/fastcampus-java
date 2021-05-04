package chapter03.ch03;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;

        this.customerGrade = "Silver";
        this.bonusRatio = 0.01;
        System.out.println("Customer(int, String) call");
    }

    public int calcPrice(int price){
        this.bonusPoint += price * this.bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return this.customerName + "님의 등급은 " +
                this.customerGrade + "이며, 보너스 포인트는"
                + this.bonusPoint + "입니다";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
