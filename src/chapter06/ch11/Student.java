package chapter06.ch11;

public class Student {
    private String studentName;
    MyLogger myLogger = MyLogger.getLogger();

    public Student(String studentName) {
        if(studentName == null){
            throw new StudentNameFormatException("이름 null 안 되!");
        }else if(studentName.split(" ").length>3){
            throw new StudentNameFormatException("이름이 너무 길어요");
        }
        this.studentName = studentName;
    }

    public String getStudentName(){
        myLogger.fine("begin get StudentName()");
        return studentName;
    }
}
