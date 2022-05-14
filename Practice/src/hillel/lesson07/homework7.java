package hillel.lesson07;
import java.util.Scanner;

public class homework7 {
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
                        [swap] - Поменять числа местами
                        [restart] - Ввести числа заново
                        [stop] - Выйти из программы
                        """);
            choose = input.next();
            switch(choose){
                case "+":
                    result = MathFormulas.add(first, second);
                    System.out.println("Результат: " + result);
                    break;
                case "-":
                    result = MathFormulas.sub(first, second);
                    System.out.println("Результат: " + result);
                    break;
                case "*":
                    result = MathFormulas.mult(first, second);
                    System.out.println("Результат: " + result);
                    break;
                case "/":
                    result = MathFormulas.div(first, second);
                    if(result != first || second == 1){
                        System.out.println("Результат: " + result);
                    }
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

class MathFormulas{
    public static double add(double a, double b){
        return a + b;
    }

    public static double sub(double a, double b){
        return a - b;
    }

    public static double mult(double a, double b){
        return a * b;
    }

    public static double div(double a, double b){
        if(b == 0){
            System.out.println("Нельзя делить на ноль!");
            return a;
        }
        return a / b;
    }
}
