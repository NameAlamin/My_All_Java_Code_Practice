package class1;

import class1.constructor.Cat;

public class Dog {
    public static void main(String[] args) {
        System.out.println("=========== object-1 ==========");
        Animal obj1 = new Animal();
        obj1.name = "Tomy";
        obj1.age = 12;
        System.out.println("Name = "+obj1.name+ " Age = "+obj1.age);
        obj1.doSomeThing();


        System.out.println("=========== object-2 ==========");
        Animal obj2 = new Animal();
        obj2.name = "Tomy 2";
        obj2.age = 15;
        System.out.println("Name = "+obj2.name+ " Age = "+obj2.age);

        System.out.println("=========== object-3 ==========");
        Animal obj3 = new Animal();
        obj3.name = "tomy3";

        Cat cat1 = new Cat();


    }
}

/*

    1. public = All package and class
    2. private = only this class
    3. protected = only class, package and get inheritance something
    4. default = only class and package

 */