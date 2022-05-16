package lambda;

public class Runner {
    public static void main(String[] args) {
//        A obj = new A() {
////            @Override
////            public void show() {
////                System.out.println("hello");
////            }
////        };

        A obj = () -> System.out.println("hello");

        obj.show();
    }
}
