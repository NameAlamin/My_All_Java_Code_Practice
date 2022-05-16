package generics;

import java.util.ArrayList;
import java.util.List;

public class WhyGenerics {

    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        myList1.add("alamin");
    }

//    public static void main(String[] args) {
//        System.out.println(doSomething(5,5.5f));
//    }
//    static int doSomething(Object p1, Object p2){
//        int value;
//        value = (int)p1 +(int)p2;
//        return value;
//    }
}
