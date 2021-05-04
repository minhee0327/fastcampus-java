package chapter03.ch03;

public class VIPCustomer  extends Customer {
    String agentID;
    double salesRatio;

    public VIPCustomer(int customerId, String customerName){
        super(customerId, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) 생성자 호출");

    }

    public String getAgentID() {
        return agentID;
    }
}
