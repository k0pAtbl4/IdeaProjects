package hillel.lesson10.homework2;

public class Content {
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
