package chapter02.ch17;

public class EmployeeTest {
    public static void main(String[] args) {
        //(아래 error): private 으로 접근 제어했기 때문
        //System.out.println(Employee.serialNum);

        System.out.println(Employee.getSerialNum());

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");
        employeeLee.showInfo();

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        employeeKim.showInfo();
    }
}
