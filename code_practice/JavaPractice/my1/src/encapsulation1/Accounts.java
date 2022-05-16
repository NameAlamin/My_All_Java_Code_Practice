package encapsulation1;

public class Accounts {
    private int semesterFee;

    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setUniversityName("DIU");
        obj1.setStudentName("Alamin");
        obj1.setStudentId(101);
        obj1.setStudentMarks(35);
        System.out.println("University = "+obj1.getUniversityName()+"\n"
                +"Student Name = "+obj1.getStudentName()+
                "\n"+"Student Id = "+obj1.getStudentId()+"\n"+"Marks = "+obj1.getStudentMarks());

    }
}
