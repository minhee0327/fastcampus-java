package chapter03.ch02;

public class VIPCustomer  extends Customer{
    String agentID;
    double salesRatio;

    public VIPCustomer(){
        this.bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public String getAgentID() {
        return agentID;
    }
}
