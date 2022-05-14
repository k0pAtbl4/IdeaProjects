package hillel.lesson02;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Dialog first = new Dialog(name);
        System.out.println(first.getName());
        String name2 = input.nextLine();
        first.setName(name2);
        System.out.println(first.getName());
    }
}
class Dialog{
    private String name;

    public Dialog(String name){
        this.name = name;
    }

    public void setName(String name){
        if(!name.isEmpty()) {
            this.name = name;
        } else{
            System.out.println("Вы ввели пустое значение");
        }
    }

    public String getName(){
        return name;
    }
}
