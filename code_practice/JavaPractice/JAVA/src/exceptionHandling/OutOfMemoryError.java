package exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        while (true){
            list.add("Alamin");
        }
    }
}
