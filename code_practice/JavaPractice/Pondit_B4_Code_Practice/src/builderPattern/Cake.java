package builderPattern;

public class Cake {
    private final double sugar;
    private final double butter;
    private final double milk;
    private final int chery;


    private Cake(CakeBuilder cakeBuilder) {
        this.sugar = cakeBuilder.sugar;
        this.butter = cakeBuilder.butter;
        this.milk = cakeBuilder.milk;
        this.chery = cakeBuilder.chery;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "sugar=" + sugar +
                ", butter=" + butter +
                ", milk=" + milk +
                ", chery=" + chery +
                '}';
    }

    public static class CakeBuilder{
        private double sugar;
        private double butter;
        private double milk;
        private int chery;

        public CakeBuilder sugar(double spoon){
            this.sugar = spoon;
            return this;
        }
        public CakeBuilder butter(double spoon){
            this.butter = spoon;
            return this;
        }
        public CakeBuilder milk(double cup){
            this.milk = cup;
            return this;
        }
        public CakeBuilder chery(int pich){
            this.chery = pich;
            return this;
        }
        public Cake build(){
            return new Cake(this);
        }
    }

}