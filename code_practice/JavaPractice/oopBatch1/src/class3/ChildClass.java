package class3;

public class ChildClass extends ParentClass {
    ChildClass(int i){
        super(i);
        System.out.println("Child = "+super.fromParent);
        this.fromParent = 10 + i;
        System.out.println("Child = "+this.fromParent);
    }
}
/*
    1. super er pore jodi . thake then ati parent class er variable ke mean kore
    2. super er pore jodi () thake then ati mean kore parent class er constructor
 */