package generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
    public void upperBound(List<? extends Number> list){
        for(Object o : list){
            System.out.print(o + " ");
        }
    }
    public static void main(String[] args) {
        UpperBound obj1 = new UpperBound();
        List<Number> n = new ArrayList<>();
        n.add(12);
        n.add(3.5);
        obj1.upperBound(n);
    }
}

class Father{

}
