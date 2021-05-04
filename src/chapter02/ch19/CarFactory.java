package chapter02.ch19;

public class CarFactory {
    // 선생님은 serialNum을 Car 에서 만들었는데
    // serialNum은 CarFactory 에서 주는게 더 좋을 것 같아서 이렇게 구현해 보았다;
    private static int serialNum = 10000;
    private static CarFactory carFactoryInstance = new CarFactory();

    public static CarFactory getInstance(){
        if(carFactoryInstance == null){
            carFactoryInstance = new CarFactory();
        }
        return carFactoryInstance;
    }

    public Car createCar(){
        serialNum++;
        Car car = new Car(serialNum);
        return car;
    }
}
