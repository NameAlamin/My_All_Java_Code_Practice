package class2.singleInheritance;

public class Runner {
    public static void main(String[] args) {
        System.out.println("======== Dog Object =========");
        Dog dog1 = new Dog();
        dog1.name = "tomy";
        dog1.legCount = 4;
        dog1.dogCall = "gew gew";
        System.out.println("Name = "+dog1.name+" Leg = "+dog1.legCount+" Call ="+dog1.dogCall);

        System.out.println("======== Cat Object =========");
        Cat cat1 = new Cat();
        cat1.name = "mini";
        cat1.legCount = 4;
        cat1.catCall = "meaw";
        System.out.println("Name = "+cat1.name+" Leg = "+cat1.legCount+" Call ="+cat1.catCall);
    }
}
