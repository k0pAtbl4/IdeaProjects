package lesson2;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;
        double first = 0, second = 0;
        int choose = 7;
        do {
            if(choose == 7) {
                System.out.println("Введите первое число: ");
                first = input.nextDouble();
                System.out.println("Введите второе число: ");
                second = input.nextDouble();
            }
            System.out.println("""
                    Какое действие над числами вы хотите сделать?
                    [1] - (+)
                    [2] - (-)
                    [3] - (*)
                    [4] - (/)
                    [5] - (Возвести первое число в степень второго)
                    [6] - (Поменять числа местами)
                    [7] - (Ввести числа заново)
                    [8] - (Закончить выполнение программы)
                    """);
            choose = input.nextInt();
            switch(choose){
                case 1:
                    result = first + second;
                    break;
                case 2:
                    result = first - second;
                    break;
                case 3:
                    result = first * second;
                    break;
                case 4:
                    if(second != 0) {
                        result = first / second;
                    }else{
                        System.out.println("Нельзя делить на ноль");
                    }
                    break;
                case 5:
                    result = Math.pow(first, second);
                    break;
                case 6:
                    double temp = first;
                    first = second;
                    second = temp;
                    break;
                case 7:
                    continue;
            }
            if((choose < 1) || (choose > 8)) {
                System.out.println("Вы ввели неверное число");
                continue;
            }
            if(choose < 6) {
                if(choose == 4){
                    if(second != 0){
                        System.out.println("Результат: " + result);
                    }
                    continue;
                }
                System.out.println("Результат: " + result);
            }
        }while(choose != 8);
    }
}
