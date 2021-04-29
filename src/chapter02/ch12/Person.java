package chapter02.ch12;

public class Person {
    String name;
    int age;

    public Person(){
        this("No name", 1);

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showPersonInfo(){
        System.out.println(name +" , " + age );
    }

    public Person getPerson(){
        return this;
    }

    public static void main(String[] args){
        Person person = new Person();
        person.showPersonInfo();
        System.out.println(person.getPerson());

        Person person2 = person.getPerson();
        System.out.println(person2.getPerson());
    }

}
