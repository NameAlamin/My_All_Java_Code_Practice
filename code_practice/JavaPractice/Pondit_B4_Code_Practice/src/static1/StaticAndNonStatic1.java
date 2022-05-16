package static1;

public class StaticAndNonStatic1 {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        StaticAndNonStatic1 test = new StaticAndNonStatic1();
        System.out.println(test.a);
        System.out.println(b);
    }
}
