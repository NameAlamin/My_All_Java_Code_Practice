package thisAndSuper.secondExample;

public class Parent {
    public int parentValue;
    Parent(){
        System.out.println("Default constructor parent class");
    }
    Parent(int i){
        this.parentValue = i;
        System.out.println("Parent Class Value = "+this.parentValue);
    }
}
