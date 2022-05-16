package multilavel_inheritance;

public class M_I_Test {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.babyDogEat();
        babyDog.dogEat();
        babyDog.animalEat();

        Dog dog = new Dog();

        System.out.println(babyDog instanceof Dog);
        System.out.println(dog instanceof BabyDog);
    }
}
