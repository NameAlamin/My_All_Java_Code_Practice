package class3_1_Encapsulation;

public class Runner {
    public static void main(String[] args) {
        Student obj2 = new Student();
        obj2.setName("alamin");
        obj2.setMarks(60);
        System.out.println("Name = "+obj2.getName()+"\nMarks = "+obj2.getMarks());
    }
}
