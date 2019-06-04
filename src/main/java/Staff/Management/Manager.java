package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    String deptName;

    public Manager(String name, int NInumber, int salary, String deptName){
        super(name, NInumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }


}

