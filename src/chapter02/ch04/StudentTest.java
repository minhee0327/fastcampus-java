package chapter02.ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();

        studentLee.studentId = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentId = 20141222;
        studentKim.setStudentName("Kim");
        studentKim.address = "경기 용인시";

        studentKim.showStudentInfo();

        System.out.println(studentKim); //패키지명.class full Name@(jvm 이 준 가상 address) 찍어 봄
        System.out.println(studentLee);

    }
}
