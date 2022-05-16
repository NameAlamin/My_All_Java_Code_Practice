package classAndObject;

public class ClassAndObject {
    public static void main(String[] args) {
        Building obj1 = new Building();
        Building obj2 = new Building();
        System.out.println(obj1 instanceof Building);
        System.out.println(obj2 instanceof Building);
        Student obj3 = new Student();
        System.out.println(obj2 instanceof Student);
    }
}