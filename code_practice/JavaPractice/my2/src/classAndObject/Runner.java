package classAndObject;

public class Runner {

    private String name;

    public static void main(String[] args) {
        System.out.println("=========== Object-1 =============");
        FirstClass object1 = new FirstClass(); // create new instance
        object1.universityName = "DIU";
        object1.studentName = "Alamin";
        object1.universityId = 8844;
        System.out.println("UniversityNamee = "+object1.universityName+"\n"+"Student Name = "+object1.studentName+"\n"+"Id = "+object1.universityId);

        System.out.println("=========== Object-2 =============");
        FirstClass obj2 = new FirstClass();
        obj2.universityName = "NSU";
        obj2.studentName = "Khokon";
        obj2.universityId = 1234;
        System.out.println("UniversityNamee = "+obj2.universityName+"\n"+"Student Name = "+obj2.studentName+"\n"+"Id = "+obj2.universityId);

        FirstClass obj3 = new FirstClass();
        System.out.println(object1 instanceof FirstClass);

    }
}

/*
    1. public = use full project all package and class
    2. private = use only this class and inner class
    3. protected = use full package all classes and inherit member
    4. default = use full package all class
 */