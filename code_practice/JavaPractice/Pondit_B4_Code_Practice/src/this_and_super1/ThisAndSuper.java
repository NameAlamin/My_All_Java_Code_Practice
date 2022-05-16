package this_and_super1;

public class ThisAndSuper {
    public static void main(String[] args) {
        ChildClass_This obj1 = new ChildClass_This(15);
    }

}

 class ParentClass_Super{
    protected int numberFromSuper;
    ParentClass_Super(int value){
        this.numberFromSuper = value;
        System.out.println(this.numberFromSuper);
    }
}

class ChildClass_This extends ParentClass_Super {

    ChildClass_This(int value) {

        super(value);
        System.out.println(this.numberFromSuper);
    }
}