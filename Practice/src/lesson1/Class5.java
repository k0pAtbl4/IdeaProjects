package lesson1;
import java.util.Scanner;
//программа решает квадратное уравнение

public class Class5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        System.out.println("Enter c:");
        int c = input.nextInt();
        int D = (b * b) - (4 * a * c);
        int operation = 0;
        if(D>0)
            operation = 1;
        if (D == 0)
            operation = 2;
        if(D < 0)
            operation = 3;
        switch (operation) {
            case 1 -> {
                double x1 = (double) (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (double) (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            case 2 -> {
                double x = (double) (-b / (2 * a));
                System.out.println("x = " + x);
            }
            case 3 -> {
                System.out.println("[No answers found]");
            }
            case 0 -> {
                System.out.println("[Something gone wrong]");
            }
        }
    }
}
