package chapter02.ch10;

public class BirthDayTest {
    public static void main(String[] args) {
        BirthDay date = new BirthDay();

        date.setDay(29);
        date.setMonth(12);
        date.setYear(2021);

        date.showDate();
    }
}
