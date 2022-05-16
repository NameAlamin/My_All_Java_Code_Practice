package polymorphysm1;

public class OverloadingTest {
    void overloadingMethod(){
        System.out.println("i have no parameter");
    }
    void overloadingMethod(int i){
        System.out.println("i have 1 integer parameter");
    }
    void overloadingMethod(String name){
        System.out.println("i have 1 string parameter");
    }

    public static void main(String[] args) {
        OverloadingTest obj1 = new OverloadingTest();
        obj1.overloadingMethod(4);
        obj1.overloadingMethod("alamin");
    }
}
