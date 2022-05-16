package encapsulation1;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.setEmpId(15);
        obj1.setEmpName("Alamin");

        System.out.println(obj1.getEmpId());
        System.out.println(obj1.getEmpName());
    }
}

class Employee{
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}