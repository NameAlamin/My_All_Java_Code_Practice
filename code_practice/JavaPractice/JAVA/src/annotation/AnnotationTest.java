package annotation;

import java.lang.reflect.Field;

public class AnnotationTest {
    @BookInfo(bookName = "java",bookAuthor = "Alamin",publisher = "pondit")
    private String springInAction;

    @PythonInfo(pythonName = "Tusar",sizeOfInches = 90.5f,pythonFood = "chicken")
    private Integer pythonInAction;

    public static void main(String[] args) throws NoSuchFieldException {
        Field field = AnnotationTest.class.getDeclaredField("springInAction");
        field.setAccessible(true);
        BookInfo bookInfo = (BookInfo) field.getAnnotations()[0];
        System.out.println("Name = "+bookInfo.bookName()+" Author = "+bookInfo.bookAuthor());

        Field field1 = AnnotationTest.class.getDeclaredField("pythonInAction");
        field1.setAccessible(true);
        PythonInfo pythonInfo = (PythonInfo) field1.getAnnotations()[0];
        System.out.println("Python Name = "+pythonInfo.pythonName());

        

    }
}
