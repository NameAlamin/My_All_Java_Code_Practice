package ReflectionDadicated;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Access_Field_Method {
    private void show(){
        System.out.println("in show");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Access_Field_Method.class.getDeclaredMethod("show");
        method.setAccessible(true);


    }
}
