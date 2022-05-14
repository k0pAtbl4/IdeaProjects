package hillel.lesson08;
import java.util.Scanner;

public class Homework8 {

    public static int factorial(int a){
        if(a == 1){
            return 1;
        }
        return a * factorial(a - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choose = 0;
        while(choose != 2) {
            System.out.println("""
                    Хотите найти факториал числа?
                    [1] - да
                    [2] - нет
                    """);
            choose = in.nextInt();
            if (choose == 1) {
                System.out.println("Введите число:");

                int number = in.nextInt();
                if (number < 1) {
                    System.out.println("Неверное число!");
                } else {
                    System.out.println(factorial(number));
                }
            }
        }
    }
}
