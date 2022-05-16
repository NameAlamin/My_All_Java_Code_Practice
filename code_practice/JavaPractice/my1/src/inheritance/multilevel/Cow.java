package inheritance.multilevel;

public class Cow extends Animal {

    String cowCall;

    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.name = "Austolian";
        cow.legCount = 4;
        cow.cowCall = "Hamba";
        System.out.println();
    }
}