package reflection;

import java.lang.reflect.InvocationTargetException;

public class Students {
    private String name;
    private int id;
    private Students(String x,Integer y){
        this.name = x;
        this.id = y;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Students std = Students.class.getDeclaredConstructor(String.class,Integer.class).newInstance("alamin",8862);
        System.out.println(std.name);
        System.out.println(std.id);
    }
}
