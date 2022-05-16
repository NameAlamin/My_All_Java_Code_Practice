package static1;

public class StaticAndNonStatic {

    public static void main(String[] args) {

        StaticTest.a = 100;

        System.out.println("Class variable A = "+ StaticTest.a);

        System.out.println("========= Obj1 =========");
        StaticTest obj1 = new StaticTest();
        obj1.b = 2000;
        System.out.println("A = "+obj1.a);
        System.out.println("B = "+obj1.b);
        System.out.println("C = "+obj1.c);

        System.out.println("========= Obj2 =========");
        StaticTest obj2 = new StaticTest();
        System.out.println("A = "+obj2.a);
        System.out.println("B = "+obj2.b);
        System.out.println("C = "+obj2.c);
    }
}

class StaticTest{
    public static final String university;
    static{
        university = "DIU";
    }
    public static int a = 10;
    public int b = 20;
    public int c = 30;
}


/*
    1. non static property not use inside of static method
    2. if non static property use inside of static method then create instance
    3. static variable is a Class variable
 */
