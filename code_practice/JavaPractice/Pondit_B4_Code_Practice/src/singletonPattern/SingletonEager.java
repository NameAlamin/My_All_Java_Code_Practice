package singletonPattern;

public class SingletonEager {
    private static SingletonEager obj1 = new SingletonEager();

    private SingletonEager(){
        System.out.println("con");
    }

    public  static SingletonEager myInstance(){
        return obj1;
    }

    public void doSomething(){
        System.out.println("Hello World");
    }

}


class EagerMain{
    public static void main(String[] args) {
        SingletonEager singletonEager1 = SingletonEager.myInstance();
        SingletonEager singletonEager2 = SingletonEager.myInstance();
    }
}