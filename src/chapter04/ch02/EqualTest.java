package chapter04.ch02;

public class EqualTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");
        Student std3 = std1;

        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));

        System.out.println(std1.hashCode() +" " + std2.hashCode());

        //실제 hashCode
        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));

        std1.setStudentName("KIM");
        Student copyStudent = (Student) std1.clone();
        System.out.println(copyStudent.toString());
        System.out.println(std1.toString());

//        String str1 = new String("abc");
//        String str2 = new String("abc");
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
//
//        Integer i = 100;
//        System.out.println(i.hashCode());
    }
}
