package inheritance.hierercical;

public class Teacher extends Accounts {
    public static void main(String[] args) {
        Teacher obj1 = new Teacher();
        obj1.teacherAmount = 40000;
        System.out.println("Salary = "+obj1.teacherAmount);
    }
}
