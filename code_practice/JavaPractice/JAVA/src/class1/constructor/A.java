package class1.constructor;

public class A {
    A(){
        System.out.println("in A");
    }
    A(int i){
        System.out.println("in A int");
    }
}

class B{
    B(){
        System.out.println("in B");
    }
}

class Runner{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A(84848);
    }
}


/*
    1. same name as class name
    2. use for memory allocation
    3. Constructor is member of method. But it's not have any return type
    4. when we create a new object every time call default constructor
    *** constructor overloading = same method name but different parameter
 */