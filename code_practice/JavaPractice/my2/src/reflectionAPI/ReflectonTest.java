package reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectonTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchMethodException {
        System.out.println("====== obj1 ======");
        Class<Student> claz1 = Student.class;
        var constructor1 = claz1.getDeclaredConstructors()[0];
        var obj1 = constructor1.newInstance();

        Class<Class1> claz2 = (Class<Class1>) Class.forName("reflectionAPI.Class1");
        var constructor2 = claz2.getDeclaredConstructors()[0];
        var obj2 = constructor2.newInstance();

        System.out.println("obj1 hashCode = "+obj1.hashCode());
        System.out.println("obj2 hashCode = "+obj2.hashCode());
    }
}
