package reflection;

import java.lang.reflect.InvocationTargetException;

public class Accounts {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Students> claz = Students.class;
        var constructor = claz.getDeclaredConstructor(String.class, Integer.class);
        constructor.setAccessible(true);
        var obj1 = constructor.newInstance("alamin",123);

    }
}
