package static2;

public class StaticAndNonStatic2 {
    public static void main(String[] args) {
        StaticNonStaticTest obj1 = new StaticNonStaticTest();
        obj1.a = 5;
        obj1.b = 15;
        obj1.c = 35;
        System.out.println("=============== Obj1 ==============");
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(StaticNonStaticTest.c);

        StaticNonStaticTest obj2 = new StaticNonStaticTest();
        System.out.println("=============== Obj2 ==============");
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(StaticNonStaticTest.c);

    }

}

class StaticNonStaticTest {
    int a = 10;
    int b = 20;
    static int c = 30;
}