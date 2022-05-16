package abstraction1;

public class AbstractionTest2 {
    public static void main(String[] args) {
        // amra jani super class er reference er moddhe sub class er object create kora jay
        // you can pass object of subclass and the reference of super class
        Iphone iphone = new Iphone();
        show(iphone);
        Walton walton = new Walton();
        show(walton); // if i not create (abstract Phone class) then we not use inside of show method difference class instance.
        Vivo vivo = new Vivo();
        show(vivo);
    }

    public static void show(Phone objPhone) {
        objPhone.phoneConfigaration();
    }
}

abstract class Phone {
    public abstract void phoneConfigaration();
}

class Iphone extends Phone {

    @Override
    public void phoneConfigaration() {
        System.out.println("Iphone-11, ios-9.1");
    }
}

class Walton extends Phone {

    @Override
    public void phoneConfigaration() {
        System.out.println("Walton-j7, ram-4gb");
    }
}

class Vivo extends Phone {

    @Override
    public void phoneConfigaration() {
        System.out.println("Vivo-A9, ram-6gb");
    }
}