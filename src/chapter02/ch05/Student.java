package chapter02.ch05;

public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;

    public Student(){};

    public Student(int studentNumber, String studentName, int grade){
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudent(){
        return studentName + "학생의 학번은 " + studentNumber + " 이고, " + grade + " 학년 입니다.";
    }
}
