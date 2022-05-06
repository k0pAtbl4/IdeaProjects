package lesson12.homework1;

public class Main {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Pdf_Documents cursPdf = new Pdf_Documents();
        Rtf_Documents cursRtf = new Rtf_Documents();

        cursPdf.setContent("This file is PDF");
        cursRtf.setContent("This file is RTF");

        cursPdf.print(ANSI_BLUE);
        cursRtf.print(ANSI_YELLOW);
    }
}
