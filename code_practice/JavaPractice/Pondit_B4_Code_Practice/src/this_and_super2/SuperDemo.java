package this_and_super2;

class A{
    public A(){
        System.out.println("in A");
    }
    public A(int i){
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        System.out.println("in B");
    }
    public B(int i){
        super(i);
        System.out.println("in B int");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B obj1 = new B(5);
    }
}