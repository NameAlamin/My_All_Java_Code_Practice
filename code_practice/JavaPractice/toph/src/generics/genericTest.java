package generics;

public class genericTest {
    static void doSomething(Object o1, Object o2){
        int result = (int)o1 + (int)o2;
        System.out.println("Result = "+result);
    }

    public static void main(String[] args) {
        doSomething(4,5);
        doSomething("alamin","khokon");
    }

}
