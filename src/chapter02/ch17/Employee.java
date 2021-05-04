package chapter02.ch17;

public class Employee {
    // static 변수는 외부에서 부로 변경하지 못하도록 private 해두는 것 권장.
    private static int serialNum = 1000;

    private int employeeID;
    private String employeeName;
    private String department;

    public Employee(){
        serialNum++;
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

    //private static 변수를 외부에서 수정하지 않도록, set method 는 생략한다.
    public static int getSerialNum() {
        //static 메서드에서 지역변수는 사용 가능
        int i = 0;
        //static 메서드에서 멤버 변수는 사용 불가능 (인스턴스가 생성되기전에 static은 메모리에 떠있기 때문에, 참조 불가능할 수 있으므로 사용불가
        //employeeName = "Mini";
        return serialNum;
    }

    public void showInfo(){
        System.out.println(this.getEmployeeName() + "님의 사번은 " + this.getEmployeeID() +" 입니다.");
    }
}
