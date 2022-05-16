package abstraction1;

public class AbstractionTest {
    public static void main(String[] args) {
        RazuPhone obj1 = new RazuPhone();
        obj1.call();
        obj1.camera();
    }
}

abstract class AlaminPhone{  // Abstract Class

    public void call(){
        System.out.println("Calling");
    }

    public abstract void camera();
    public abstract void dance();
    public abstract void cook();
}

abstract class KhokonPhone extends AlaminPhone{
    public void camera(){
        System.out.println("Camera working");
    }
}

class RazuPhone extends KhokonPhone{
    public void dance(){
        System.out.println("Dancing");
    }
    public void cook(){
        System.out.println("Cooking");
    }
}

