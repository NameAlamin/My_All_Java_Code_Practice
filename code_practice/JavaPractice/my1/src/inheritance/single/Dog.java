package inheritance.single;

public class Dog extends Animal {

    String dogCall;

    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.name = "Tomi";
        obj1.legCount = 4;
        obj1.dogCall = "gewGew";
        System.out.println("Name = "+obj1.name+"\n"+"Leg Count = "+obj1.legCount+"\n"+"Dog Call = "+obj1.dogCall);
    }

    /*
        here Dog = subclass / child class
        here Animal = superclass / parent class
     */
}
