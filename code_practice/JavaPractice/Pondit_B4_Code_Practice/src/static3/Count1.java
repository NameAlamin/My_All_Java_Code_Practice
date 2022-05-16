package static3;

public class Count1 {
    int count = 0;

    Count1(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Count1 obj1 = new Count1();
        Count1 obj2 = new Count1();
        Count1 obj3 = new Count1();
    }
}
