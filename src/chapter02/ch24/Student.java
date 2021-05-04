package chapter02.ch24;

import java.util.ArrayList;

public class Student {
    int studentId;
    String studentName;

    ArrayList<Subject> subjectList;

    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void setSubjectList(String subjectName, int score){
//        subjectList.add(new Subject(subjectName, score));

        Subject subject = new Subject();
        subject.setSubject(subjectName);
        subject.setScore(score);

        subjectList.add(subject);
    }

    public int getTotalScore(){
        int ret = 0;
        for(Subject s: subjectList){
            ret += s.score;
        }
        return ret;
    }

    public void showInfo(){
        for (Subject s: subjectList){
            System.out.println(s.subject +" 과목 점수 : " + s.score);
        }
        System.out.println("-----------------------------------");
        System.out.println("총점: " + getTotalScore());
    }

}
