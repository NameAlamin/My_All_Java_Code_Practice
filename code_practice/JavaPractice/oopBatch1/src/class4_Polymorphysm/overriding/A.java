package class4_Polymorphysm.overriding;

public class A {
    int i = 10;
    void show(){
        System.out.println("parent class");
    }
}

class B extends A{
    int i = 20;
    @Override
    void show(){
        System.out.println("child class");
    }
}

class Main{
    public static void main(String[] args) {
     B obj = new B();
        System.out.println(obj.i);
    }
}
/*
    2. Method Overriding
        a. different class
        b. two classes have obviously parent child relationship
        c. method name obviously same
        d. parameter type/count obviously same
        e. return type same
 */