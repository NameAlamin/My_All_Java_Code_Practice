package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(
        ElementType.FIELD
)

@Retention(
        RetentionPolicy.RUNTIME
)

public @interface BookInfo {
    String bookName();
    String bookAuthor();
    String bookPublisher();
}
