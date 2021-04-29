package chapter02.ch14;

public class TransportTest {
    public static void main(String[] args) {
        Student Edward = new Student("Edward", 20000);

        Taxi taxi = new Taxi("잘 간다 운수");

        Edward.takeTaxi(taxi);

        Edward.showInfo();
        taxi.showTaxiInfo();

    }
}
