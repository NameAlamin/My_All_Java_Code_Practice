package thisAndSuper.secondExample;

public class Child extends Parent {
    Child(int value){
        super(value);
        System.out.println("Child Class Value = "+super.parentValue);
        this.parentValue = 10 + value;
        System.out.println("Child Class Value = "+this.parentValue);
    }

    public static void main(String[] args) {
       Child obj1 = new Child(15);
    }
}