class Employee{
    String empName;
   private int empId;
    int empSalary;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
}

public class Encapsul {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setEmpId(444);
        System.out.println(emp.getEmpId());
    }
}
