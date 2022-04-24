package lesson1;
import java.util.Scanner;
//программа находит среднее арифметическое числа
public class Class6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double numb1 = input.nextDouble();
        System.out.println("Enter 2nd number: ");
        double numb2 = input.nextDouble();
        double avg = (numb1 + numb2) / 2;
        System.out.println("Average number: " + avg);
    }
}
