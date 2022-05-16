package static1;

public class StaticBlock {
    static final String universityName;
    static {
        universityName = "DIU";
    }
    String name1;
    int id1;

    public static void main(String[] args) {
        System.out.println("============================= obj1 ================================");
        StaticBlock obj1 = new StaticBlock();
        obj1.name1 = "Alamin";
        obj1.id1 = 101;
        System.out.println("University = "+universityName+"\n"+"Student Name = "+obj1.name1+"\n"+"Student Id = "+obj1.id1);

        System.out.println("============================= obj1 ================================");
        StaticBlock obj2 = new StaticBlock();
        obj2.name1 = "Khokon";
        obj2.id1 = 202;
        System.out.println("University = "+universityName+"\n"+"Student Name = "+obj2.name1+"\n"+"Student Id = "+obj2.id1);
    }

}
