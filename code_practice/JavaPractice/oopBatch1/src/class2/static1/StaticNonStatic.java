package class2.static1;

public class StaticNonStatic {
    int a = 10;
    public int b = 20;
    public static int c = 30;

    public static void main(String[] args) {
        StaticNonStatic obj1 = new StaticNonStatic();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(StaticNonStatic.c);
    }
}

/*
    1. static context er moddhe non static property/method kokhonoi use kora jay na if we use this then
       must be create an Object this class.
    2. static hoche class er personal property
    3. static is a class variable
 */