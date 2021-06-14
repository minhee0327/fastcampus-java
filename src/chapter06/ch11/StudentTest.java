package chapter06.ch11;

public class StudentTest {
    public static void main(String[] args) {
        MyLogger myLogger = MyLogger.getLogger();

        try {
            Student student = new Student(null);
        }catch (StudentNameFormatException e){
            myLogger.warning(e.getMessage());
        }

        try {
            Student student = new Student("Edward Jon Kim Park");
        }catch (StudentNameFormatException e){
            myLogger.warning(e.getMessage());
        }

        Student student = new Student("James");
        student.getStudentName();
    }
}
