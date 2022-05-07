package hillel.lesson1;
import java.util.Scanner;
//программа выводит числа заданого массива в обратном порядке
public class Class1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an amount of numbers: ");
        int amount = scan.nextInt();
        int[] sent = new int[amount];
        System.out.println("Enter these numbers: ");
        for(int i = 0; i < amount; i++)
        {
            sent[i] = scan.nextInt();
        }
        for(int i = amount - 1; i >= 0; i--)
        {
            System.out.print(sent[i] + " ");
        }
    }
}
