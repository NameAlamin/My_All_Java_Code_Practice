package thisAndSuper;

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


/*
    New we learn this and super keyword
    1. this = current class reference
    2. super = parent class reference
    3. if we use super keyword then Class must have parent child relationship

 */