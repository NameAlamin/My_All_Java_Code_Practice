package class3_1_Encapsulation;

public class Diu {
    public static void main(String[] args) {
        Employee lecturer = new Employee();
        lecturer.setBaseSalary(40000);
        lecturer.setExtraHour(4);
        lecturer.setHourlyRate(500);
        System.out.println("Lecturer Salary = "+lecturer.calculateSalary());

        Employee professor = new Employee();
        professor.setBaseSalary(90000);
        professor.setExtraHour(10);
        professor.setHourlyRate(700);
        System.out.println("Professor Salary = "+professor.calculateSalary());

        Employee cleaner = new Employee();
        cleaner.setBaseSalary(15000);
        cleaner.setExtraHour(50);
        cleaner.setHourlyRate(35);
        System.out.println("Cleaner Salary = "+cleaner.calculateSalary());
    }
}
