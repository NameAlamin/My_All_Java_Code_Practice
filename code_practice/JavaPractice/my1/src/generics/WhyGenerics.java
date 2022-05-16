package generics;

import java.util.ArrayList;
import java.util.List;

public class WhyGenerics {

    public static void main(String[] args) {

        // doSomething("alamin",12.5); -> we not provide right value

        List<Integer> list = new ArrayList();
        list.add(15);
        // list.add(15.4);
        list.add(17);
        // list.add("alamin");
    }

    static void doSomething(Object o1, Object o2){
        // int i = o1 + o2;  it's not possible
        int j = (int)o1 + (int)o2;
        System.out.println(j);
    }
}