package chapter03.ch10;

public abstract class Car {
    //반드시 구현해야함.
    public abstract void dive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }
    // 필요에 맞게 사용
    public void washCar(){}

    public final void run(){
        startCar();
        dive();
        wiper();
        stop();
        turnOff();
        washCar();
    }
}
