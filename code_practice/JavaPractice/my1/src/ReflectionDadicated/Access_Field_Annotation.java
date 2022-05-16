package ReflectionDadicated;

import java.lang.reflect.Field;

public class Access_Field_Annotation {

    @UniversityInfo(universityName = "DIU", studentName = "Alamin", studentId = 8862)
    private String processor;

    public static void main(String[] args) throws NoSuchFieldException {
        Field field = Access_Field_Annotation.class.getDeclaredField("processor");
        field.setAccessible(true);
        UniversityInfo universityInfo = (UniversityInfo) field.getDeclaredAnnotations()[0];
        System.out.println(universityInfo.universityName());
    }
}