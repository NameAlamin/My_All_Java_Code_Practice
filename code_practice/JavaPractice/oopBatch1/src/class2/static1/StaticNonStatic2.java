package class2.static1;

public class StaticNonStatic2 {
    public static void main(String[] args) {
        System.out.println("C = "+StaticTest.c); // 30
        StaticTest.c = 500;
        System.out.println("======= obj1 =========");
        StaticTest obj1 = new StaticTest();
        System.out.println("obj1 hash code = "+obj1.hashCode());
        System.out.println("A = "+obj1.a); // 10
        obj1.a = 12;
        System.out.println("A = "+obj1.a); //12
        System.out.println("B = "+obj1.b); // 20
        System.out.println("C = "+StaticTest.c); // 500
        System.out.println("A === = "+obj1.a);

        System.out.println("======= obj2 =========");
        StaticTest obj2 = new StaticTest();
        System.out.println("A = "+obj2.a); // 10
        System.out.println("B = "+obj2.b); // 20
        System.out.println("C = "+StaticTest.c); // 500
        System.out.println("C = "+obj2.c); // 500
    }
}

class StaticTest{
    static {
        name = "Diu";
    }
    StaticTest(){
        a = 30;
        b = 40;
        c = 40;
    }
    static final String name;
    public int a = 10;
    public int b = 20;
    public static int c = 30;
}