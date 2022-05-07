package hillel.lesson10;
import java.util.Scanner;

public class homework10_2 {
    public static void main(String[] args) {
        int operationCondition = 1;
        Title bookTitle = new Title();
        Author bookAuthor = new Author();
        Content bookContent = new Content();
        Scanner input = new Scanner(System.in);
        while(operationCondition != 0){

            System.out.println("Введите название книги: ");
            bookTitle.setTitle_element(input.nextLine());

            System.out.println("Введите автора книги: ");
            bookAuthor.setAuthor_element(input.nextLine());

            System.out.println("Введите содержание книги: ");
            bookContent.setContent_element(input.nextLine());

            System.out.println("""
            Хотите изменить данные о книге?
            [0] - Нет
            [1] - Да
            """);
            operationCondition = Integer.parseInt(input.nextLine());
        }
        bookTitle.show();
        bookAuthor.show();
        bookContent.show();
    }
}

class Title{
    private String title_element;

    public String getTitle_element() {
        return title_element;
    }

    public void setTitle_element(String title_element) {
        this.title_element = title_element;
    }

    void show(){
        System.out.println("Название: " + title_element);
    }
}

class Author{
    private String author_element;

    public String getAuthor_element() {
        return author_element;
    }

    public void setAuthor_element(String author_element) {
        this.author_element = author_element;
    }

    void show(){
        System.out.println("Автор: " + author_element);
    }
}

class Content{
    private String content_element;

    public String getContent_element() {
        return content_element;
    }

    public void setContent_element(String content_element) {
        this.content_element = content_element;
    }

    void show(){
        System.out.println("Содержание: " + content_element);
    }
}