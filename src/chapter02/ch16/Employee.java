package chapter02.ch16;

public class Employee {
    public static int serialNum = 1000;

    private int employeeID;
    private String employeeName;
    private String department;

    public Employee(){
        //serialNum 같은 경우 모두가 공유하는 숫자.
        serialNum++;
        //employeeId에 복사해서 각 employee 인스턴스 별로 번호를 할당해줘야한다.
        employeeID = serialNum;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void showInfo(){
        System.out.println(this.getEmployeeName() + "님의 사번은 " + this.getEmployeeID() +" 입니다.");
    }
}
