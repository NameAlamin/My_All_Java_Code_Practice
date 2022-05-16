package class4_Polymorphysm.overloading;

public class Student {
    void show(){
        System.out.println("no any parameter");
    }
    void show(int i){
        System.out.println("one integer value");
    }
    void show(String i){
        System.out.println("one string value");
    }
    void show(int j,String k){
        System.out.println("one int and one string");
    }
}

class Main{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.show(5,"alam");
        obj.show();
    }
}

/*
    1. Method overloading
        a. same class
        b. same method name
        c. different parameter type/count

 */