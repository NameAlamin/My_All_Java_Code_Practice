package classAndObject;

public class Accounts {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.studentName = "alamin";
//        System.out.println("Name = "+student1.studentName);

        A obj = new B();
        System.out.println(obj.x);
        System.out.println(obj.y);
       obj.show();
       obj.show1();
    }
}
class A{
    int x = 12;
    int y = 22;
    public void show(){
        System.out.println("in A");
    }
    public void show1(){
        System.out.println("in show 1");
    }
}
class B extends A{
    int x = 1212;
    public void show(){
        System.out.println("in B");
    }
}