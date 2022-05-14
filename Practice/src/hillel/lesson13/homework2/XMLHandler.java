package hillel.lesson13.homework2;

public class XMLHandler extends AbstractHandler{
    @Override
    void printType(){
        System.out.println("XML:");
    }

    @Override
    void printData() {
        create();
        open();
        change();
        save();
    }

    @Override
    void open() {
        printType();
        super.open();
    }

    @Override
    void create() {
        printType();
        super.create();
    }

    @Override
    void change() {
        printType();
        super.change();
    }

    @Override
    void save() {
        printType();
        super.save();
    }
}
