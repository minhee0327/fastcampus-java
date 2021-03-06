package chapter03.ch16.sol1;

public abstract class PlayerLevel {
    abstract void run();
    abstract void jump();
    abstract void turn();
    abstract void showLevelMessage();

    public void go(int count) {
        showLevelMessage();
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}
