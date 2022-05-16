package class5;

public class Mobile {
    public static void main(String[] args) {
        Emp3Phone obj1 = new Emp3Phone();
    }
}

abstract class Emp1Phone{  // abstract class
    void call(){
        System.out.println("call");
    }
    void message(){
        System.out.println("message");
    }
    abstract void move();
    abstract void dance();
    abstract void cook();
}

abstract class Emp2Phone extends Emp1Phone{ // abstract class
    void move(){
        System.out.println("move");
    }
    abstract void dance();
    abstract void cook();
}

class Emp3Phone extends Emp2Phone{  // concrit class
    void dance(){
        System.out.println("dance");
    }
    void cook(){
        System.out.println("cook");
    }
}


/*
    1. kono method er sathe abstract keyword thakle seti abstract method
    2. kono class er moddhe 1 ti ba tar bashi abstract method thakle sei class ti abstract class
    3. abstract class er object create kora jay na
 */
