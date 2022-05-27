package hillel.lesson10.homework2;

import java.util.Scanner;

public class homework10_2 {
    public static void main(String[] args) {
        int operationCondition = 1;
        Title bookTitle = new Title();
        Author bookAuthor = new Author();
        Content bookContent = new Content();
        Scanner input = new Scanner(System.in);
        while(operationCondition != 0){

            System.out.println("Введите название книги: ");
            bookTitle.setTitle_element(input.nextLine());

            System.out.println("Введите автора книги: ");
            bookAuthor.setAuthor_element(input.nextLine());

            System.out.println("Введите содержание книги: ");
            bookContent.setContent_element(input.nextLine());

            System.out.println("""
            Хотите изменить данные о книге?
            [0] - Нет
            [1] - Да
            """);
            operationCondition = Integer.parseInt(input.nextLine());
        }
        bookTitle.show();
        bookAuthor.show();
        bookContent.show();
    }
}