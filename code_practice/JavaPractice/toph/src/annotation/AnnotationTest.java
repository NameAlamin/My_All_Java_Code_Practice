package annotation;

import java.lang.reflect.Field;

public class AnnotationTest {

    public static void main(String[] args) throws NoSuchFieldException {
        Class<AnnotationStudent> claz = AnnotationStudent.class;
        System.out.println("======= book info ==========");
        Field field1 = claz.getDeclaredField("springInAction");
        field1.setAccessible(true);
        BookInfo obj1 = (BookInfo) field1.getAnnotations()[0];
        System.out.println(obj1.bookAuthor()+"\n"+obj1.bookName()+"\n"+obj1.bookPublisher());

        System.out.println("======= paper info ==========");
        Field field2 = claz.getDeclaredField("paper");
        field2.setAccessible(true);
        PaperInfo obj2 = (PaperInfo) field2.getAnnotations()[0];
        System.out.println(obj2.paperName()+"\n"+obj2.paperCount());



    }
}
