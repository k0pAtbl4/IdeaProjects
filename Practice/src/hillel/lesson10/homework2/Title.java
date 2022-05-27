package hillel.lesson10.homework2;

public class Title {
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
