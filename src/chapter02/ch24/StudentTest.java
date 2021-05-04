package chapter02.ch24;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001 , "Lee");
        Student studentKim = new Student(1002, "Kim");

        studentLee.setSubjectList("국어", 100);
        studentLee.setSubjectList("수학", 50);

        studentKim.setSubjectList("국어", 70);
        studentKim.setSubjectList("수학", 85);
        studentKim.setSubjectList("영어", 100);

        studentLee.showInfo();
        System.out.println("==================================");
        studentKim.showInfo();
    }
}
