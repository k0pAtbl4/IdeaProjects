package hillel.lesson1;
import java.util.Scanner;
//простой калькулятор с 2 числами и выбором 4 действий на выбор
public class Class2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        float result = 0;
        while(!quit) {
            System.out.println("Do you want to quit?\n[1] - Yes\n[Other number] - No");
            if(scan.nextInt() == 1)
            {
                quit = true;
            }
            else {
                System.out.print("Enter 1st number: ");
                int numb1 = scan.nextInt();
                System.out.print("Enter 2nd number: ");
                int numb2 = scan.nextInt();
                System.out.print("""
                        ================================
                        What operation do you want to do?
                        [1] - (+)
                        [2] - (-)
                        [3] - (*)
                        [4] - [/]
                        =================================
                        """);
                int operation = scan.nextInt();
                switch (operation) {
                    case 1 -> result = numb1 + numb2;
                    case 2 -> result = numb1 - numb2;
                    case 3 -> result = numb1 * numb2;
                    case 4 -> result = (float) numb1 / (float) numb2;
                }
                System.out.println("Result: " + result + "\n");

            }
        }
    }
}
