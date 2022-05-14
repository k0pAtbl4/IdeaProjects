package hillel.lesson13.homework2;

public abstract class AbstractHandler {
    void printType(){}
    void printData(){}
    void open(){
        System.out.println("Document opened\n");
    }
    void create(){
        System.out.println("Document created\n");
    }
    void change(){
        System.out.println("Document changed\n");
    }
    void save(){
        System.out.println("Document saved\n");
    }
}
