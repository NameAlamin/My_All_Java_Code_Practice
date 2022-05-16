package builderPattern;

public class MainBuildr {
    public static void main(String[] args) {
        Cake cake = new Cake.CakeBuilder()
                .butter(2.5)
                .milk(3)
                .chery(7)
                .build();
        System.out.println(cake);
    }
}
