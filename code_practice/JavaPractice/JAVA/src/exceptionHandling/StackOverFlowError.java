package exceptionHandling;

public class StackOverFlowError {

    public static void main(String[] args) {
        callMe();
    }

    static void callMe(){
        System.out.println("I am call only call me");
        callMeToo1();
    }
    static void callMeToo1(){
        System.out.println("I am call me too 1");
        callMeToo2();
    }
    static void callMeToo2(){
        System.out.println("I am call me too 2");
    }
}