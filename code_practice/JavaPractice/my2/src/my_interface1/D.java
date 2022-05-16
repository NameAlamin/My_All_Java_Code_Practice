package my_interface1;

public class D implements A,B,C {

    @Override
    public void show1() {
        System.out.println("show 1");
    }

    @Override
    public void show2() {
        System.out.println("show 2");
    }

    @Override
    public void show3() {
        System.out.println("show 3");
    }

    public static void main(String[] args) {
        D obj1 = new D();
        obj1.show1();
        obj1.show2();
    }

}
