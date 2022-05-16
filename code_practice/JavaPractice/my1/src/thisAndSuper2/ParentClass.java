package thisAndSuper2;

public class ParentClass {

    int numberFromParent;

    ParentClass(){
        System.out.println("parent class default constructor");
    }
    ParentClass(int i){
        this.numberFromParent = i;
        System.out.println(this.numberFromParent);
    }
}
