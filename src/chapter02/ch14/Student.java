package chapter02.ch14;

import chapter02.ch13.Bus;
import chapter02.ch13.Subway;

public class Student {
    String studentName;
    int money;

    Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        this.money -=10000;
    }


    public void showInfo(){
        System.out.println(studentName + " 님의 남은 돈은 " + money +"원 입니다.");
    }
}
