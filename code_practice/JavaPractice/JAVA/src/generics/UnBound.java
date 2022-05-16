package generics;

import java.util.ArrayList;
import java.util.List;

public class UnBound {

    public void unbounded(List<?> list){
        for(Object o : list){
            System.out.print(o + " ");
        }
    }

    public static void main(String[] args) {
        UnBound obj1 = new UnBound();
        List<Integer> i = new ArrayList<>();
        i.add(5);
        i.add(8);
        obj1.unbounded(i);
        List<String> s = new ArrayList<>();
        s.add("alamin");
        s.add("khokon");
        obj1.unbounded(s);
    }

}
