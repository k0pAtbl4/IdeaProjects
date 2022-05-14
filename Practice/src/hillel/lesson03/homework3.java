package hillel.lesson03;
import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;
        double first = 0, second = 0;
        String choose = "first";
        while(!choose.equals("stop")) {
            if(choose.equals("first") || choose.equals("restart")) {
                System.out.println("Введите первое число: ");
                first = input.nextDouble();
                System.out.println("Введите второе число: ");
                second = input.nextDouble();
            }
                System.out.println("""
                        Какое действие над числами вы хотите сделать?
                        [+]
                        [-]
                        [*]
                        [/]
                        [square] - (Возвести первое число в степень второго)
                        [swap] - (Поменять числа местами)
                        [restart] - (Ввести числа заново)
                        [stop] - (Закончить выполнение программы)
                        """);
                choose = input.next();
            switch(choose){
                case "+":
                    result = first + second;
                    System.out.println("Результат: " + result);
                    break;
                case "-":
                    result = first - second;
                    System.out.println("Результат: " + result);
                    break;
                case "*":
                    result = first * second;
                    System.out.println("Результат: " + result);
                    break;
                case "/":
                    if(second != 0) {
                        result = first / second;
                        System.out.println("Результат: " + result);
                    }else{
                        System.out.println("Нельзя делить на ноль");
                    }
                    break;
                case "square":
                    result = Math.pow(first, second);
                    System.out.println("Результат: " + result);
                    break;
                case "swap":
                    double temp = first;
                    first = second;
                    second = temp;
                    break;
                case "restart":
                    continue;
            }
        }
    }
}

