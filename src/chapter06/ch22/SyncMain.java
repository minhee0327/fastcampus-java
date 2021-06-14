package chapter06.ch22;

class Bank {
    private int money = 10000;

    public void saveMoney(int money) {
        synchronized (this){
            int m = getMoney();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setMoney(m + money);
        }
    }

    public synchronized void minusMoney(int money) {
        int m = getMoney();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m - money);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread{
    public void run(){
        System.out.println("start save");
        SyncMain.myBank.saveMoney(3000);
        System.out.println("saveMoney(3000): " + SyncMain.myBank.getMoney());
    }
}

class ParkWife extends Thread{
    public void run(){
        System.out.println("start minus");
        SyncMain.myBank.minusMoney(1000);
        System.out.println("minusMoney(1000): " + SyncMain.myBank.getMoney());
    }
}

public class SyncMain {
    public static Bank myBank = new Bank();

    public static void main(String[] args) {
        Park park = new Park();
        park.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ParkWife parkWife = new ParkWife();
        parkWife.start();
    }
}
