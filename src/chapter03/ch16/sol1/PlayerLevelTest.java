package chapter03.ch16.sol1;

public class PlayerLevelTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        player.upgradeLevel(new AdvancedLevel());
        player.play(2);

        player.upgradeLevel(new SuperLevel());
        player.play(3);

    }
}
