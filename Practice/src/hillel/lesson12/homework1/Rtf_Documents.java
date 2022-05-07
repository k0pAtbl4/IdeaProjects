package hillel.lesson12.homework1;

public class Rtf_Documents extends Printer {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    void print(String color) {
        super.print(color);
        System.out.println(color + content + ANSI_RESET);
    }
}
