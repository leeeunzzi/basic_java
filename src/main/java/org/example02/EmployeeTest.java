package org.example02;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이은진");
        //System.out.println("employeeLee.serialNum = " + employeeLee.serialNum);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김아무개");
        //employeeKim.serialNum++;
        //System.out.println("employeeKim.serialNum = " + employeeKim.serialNum);

        System.out.println("employeeLee.getEmployeeId() = " + employeeLee.getEmployeeId());
        System.out.println("employeeKim.getEmployeeId() = " + employeeKim.getEmployeeId());
    }
}
