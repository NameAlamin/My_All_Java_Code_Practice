package inheritance.hierercical;

public class Student extends Accounts {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.studentAmount = 20000;
        System.out.println("Semester Fee = "+obj1.studentAmount);
    }
}
