package annotation;

public class AnnotationStudent {
    @BookInfo(bookName = "Java", bookAuthor = "Alamin", bookPublisher = "Pondit")
    private String springInAction;

    @PaperInfo(paperName = "kornofuli", paperCount = 5)
    private String paper;
}
