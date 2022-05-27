package hillel.lesson10.homework2;

public class Author {
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
