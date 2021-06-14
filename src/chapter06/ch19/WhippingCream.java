package chapter06.ch19;

public class WhippingCream extends Decorator{
    public WhippingCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print("Added Whipping Cream ");
    }
}
