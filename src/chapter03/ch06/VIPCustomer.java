package chapter03.ch06;

public class VIPCustomer  extends Customer {
    String agentID;
    double salesRatio;

    public VIPCustomer(int customerId, String customerName){
        super(customerId, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int) price * salesRatio;
        return price;
    }

    public String getAgentID() {
        return agentID;
    }
}
