package class3;

public class B extends A {
    B(){
        //super();
        System.out.println("in B");
    }
    B(int i){
        super(i);
        System.out.println("in B integer");
    }
}