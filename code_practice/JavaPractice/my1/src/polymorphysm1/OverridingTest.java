package polymorphysm1;

public class OverridingTest {
    public static void main(String[] args) {
        A obj1;
        obj1 = new B(); // runtime polymorphism
        obj1.show();

        obj1 = new C();
        obj1.show(); // Dynamic Method Dispatch -> because same reference different object creation
    }
}

class A{
    void show(){
        System.out.println("in A");
    }
}

class B extends A{
    @Override
    void show(){
        System.out.println("in B");
    }
}

class C extends A{
    void show(){
        System.out.println("in C");
    }
}
