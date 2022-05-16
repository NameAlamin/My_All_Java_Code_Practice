package static1;

public class StaticAndNonStatic {

    public static void main(String[] args) {
        Test.c = 500;

        System.out.println("C = "+Test.c); // 5000

        System.out.println("================================= obj1 ================================");
        Test obj1 = new Test();
        System.out.println("C = "+obj1.c); // 5000
        System.out.println("A = "+obj1.a);
        obj1.a = 200;
        System.out.println("A = "+obj1.a);

        System.out.println("================================= obj2 ================================");
        Test obj2 = new Test();
        System.out.println("C = "+obj2.c); // 5000
        System.out.println("A = "+obj2.a);


    }
}

class Test{
    int a = 20;
    int b = 30;
    static int c = 40;
}

/*
    1. inside of static method not access outside nonStatic property or method.
       if we want access then create this class instance.
    2. Static variable call Class variable
    3. Static variable personal property of class
 */