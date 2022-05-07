package hillel.lesson12.homework1;

public class Pdf_Documents extends Printer{
    private String content;
    private String color;

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