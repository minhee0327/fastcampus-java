package chapter03.ch16.sol1;

public class Player {
    PlayerLevel level;

    Player(){
        level = new BeginnerLevel();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level){
        this.level = level;
    }

    public void play(int count){
        getLevel().go(count);
    }
}
