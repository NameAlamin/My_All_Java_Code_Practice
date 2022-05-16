package constructor;

public class A {
    A(){
        System.out.println("in A");
    }
    A(int i){
        System.out.println("in A integer");
    }
    A(float i){
        System.out.println("in A float");
    }

}

class B{
    B(){
        System.out.println("in B");
    }
    B(int i){
        System.out.println("in B int");
    }
}

class Runner{
    public static void main(String[] args) {
        A obj1 = new A();
        A obj3 = new A(5);
    }
}

/*
    Constructor:
    1. same name is class name
    2. it is member of method, but it's not return type
    3. it will be used to allocate memory

    *** when we create a new instance then all time it cal default constructor

    == Constructor overloading: same name of class name but difrent paramiter
 */
