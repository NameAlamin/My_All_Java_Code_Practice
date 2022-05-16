package static1;

public class Count2 {
    static int count = 0;
    Count2(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Count2 obj1 = new Count2();
        Count2 obj2 = new Count2();
        Count2 obj3 = new Count2();
    }
}
