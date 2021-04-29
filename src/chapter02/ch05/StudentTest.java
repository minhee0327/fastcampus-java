package chapter02.ch05;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        // 멤버 변수는 인스턴스 생성시, (자동) 초기화
        System.out.println(studentLee.showStudent());

        Student studentKim = new Student(12345, "Kim", 3);
        System.out.println(studentKim.showStudent());

    }
}
