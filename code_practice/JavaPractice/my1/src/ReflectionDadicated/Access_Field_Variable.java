package ReflectionDadicated;

import java.lang.reflect.InvocationTargetException;

public class Access_Field_Variable {
    private String universityName;
    private String studentName;
    private int studentId;
    public int cgpa;

    private Access_Field_Variable(String a, String b, Integer c, Integer d){
        this.universityName = a;
        this.studentName = b;
        this.studentId = c;
        this.cgpa = d;
    }

    // can i call method using reflection?
    private void show(){
        System.out.println("This is private method access using reflection");
    }

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Access_Field_Variable obj = Access_Field_Variable.class
                .getDeclaredConstructor(String.class,String.class,Integer.class,Integer.class)
                .newInstance("Diu","Alamin",8862,3);

        System.out.println(obj.hashCode()+obj.universityName+obj.studentName);
    }
}
