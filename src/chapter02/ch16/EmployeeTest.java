package chapter02.ch16;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        //static 변수(class 변수)는 인스턴스의 생성 없이 불러올 수 있다.
        //static 변수는 참조변수로 가져오기보다는, class 이름으로 직접 참조하는 편이 좋다.
        //만약 참조 변수로 static 영역을 수정하게 되면,
        //나중에 코드가 복잡해질 수록 어디서 수정했는지 찾기 어려워 질 수 있다.
//        System.out.println(employeeLee.serialNum);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
//        employeeKim.serialNum++;

//        System.out.println(employeeLee.serialNum);
//        System.out.println(employeeKim.serialNum);

        employeeLee.showInfo();
        employeeKim.showInfo();
    }
}
