package thisAndSuper2;

public class ChildClass extends ParentClass {
    ChildClass(){
        super();
        System.out.println("child class default constructor");
    }
    ChildClass(int i){
        super(i);
        System.out.println(super.numberFromParent);
        this.numberFromParent = 10+i;
        System.out.println(this.numberFromParent);
    }
}
