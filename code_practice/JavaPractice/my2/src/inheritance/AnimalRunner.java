package inheritance;

public class AnimalRunner {
    public static void main(String[] args) {
        System.out.println("======= Dog Class =======");
        Dog dog1 = new Dog();
        dog1.name = "tomi";
        dog1.logCount = 4;
        dog1.dogCall = "gew-gew";
        System.out.println("Name = "+dog1.name+ " || Leg Count = "+dog1.logCount+" || Call = "+dog1.dogCall);

        System.out.println("======= BabyDog Class =======");
        BabyDog babyDog1 = new BabyDog();
        babyDog1.dogEat = "Milk";
        System.out.println("Baby Dog Eat = "+babyDog1.dogEat);

        System.out.println("======= Cat Class =======");
        Cat cat1 = new Cat();
        cat1.name = "Mini";
        System.out.println("Name = "+cat1.name);
    }
}