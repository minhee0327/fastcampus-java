package chapter06.ch19;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee ethiopiaCoffee = new EthiopiaAmericano();
        ethiopiaCoffee.brewing();

        System.out.println();
        Coffee Latte = new Latte(ethiopiaCoffee);
        Latte.brewing();

        System.out.println();
        Coffee mochaEthiopia = new Mocha(new Latte(new EthiopiaAmericano()));
        mochaEthiopia.brewing();

        System.out.println();
        Coffee kenayLatte = new WhippingCream(new Latte(new KenyaAmericano()));
        kenayLatte.brewing();

    }
}
