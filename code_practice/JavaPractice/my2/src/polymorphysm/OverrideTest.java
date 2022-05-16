package polymorphysm;

public class OverrideTest {
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.show();
    }
}

class A{
    public void show(){
        System.out.println("in A");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C");
    }
}