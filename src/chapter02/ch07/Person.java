package chapter02.ch07;

public class Person {
    String Name;
    int height;
    int weight;
    String sexual;
    int age;

    public Person(String Name, int height, int weight, int age, String sexual) {
        this.Name = Name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.sexual = sexual;
    }

    public void showInfo() {
        System.out.println(this.Name + " 님의 나이는: " + this.age + " 키: " + this.height + " 몸무게: " + this.weight +
                "인 " + this.sexual + "성 입니다.");
    }
}
