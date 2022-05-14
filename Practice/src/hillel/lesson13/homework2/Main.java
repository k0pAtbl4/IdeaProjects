package hillel.lesson13.homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Напишите название документа и его формат. \nНапример: <название>.<формат>");
        String document = input.nextLine();

        if(document.endsWith(".doc") || document.endsWith(".txt") || document.endsWith(".xml")) {
            if (document.endsWith(".doc")) {
                DOCHandler file = new DOCHandler();
                file.printData();
            }
            if (document.endsWith(".txt")) {
                TXTHandler file = new TXTHandler();
                file.printData();
            }
            if (document.endsWith(".xml")) {
                XMLHandler file = new XMLHandler();
                file.printData();
            }
        } else {
            System.out.println("Вы ввели неверный формат документа");
        }
    }

}
