package hillel.lesson01;
//программа выводит числа от 3 до 100, и переносит тест на новую строку каждый раз, когда число делится на 10
//также, выводит кол-во итераций
public class Main
{
    public static void main(String[] args)
    {
        int AddNumb1 = 1;
        int AddNumb2 = 2;
        int res = AddNumb1 + AddNumb2;
        int IterAmount = 0;
        for(int i = 0; res <= 100; i++)
        {
            if(res%10 != 0)
            {
                System.out.print(res + " ");
            }
            else
            {
                System.out.println(res + " ");
            }
            res = res + AddNumb1;
            IterAmount = i;
        }
        System.out.println("iterations: " + IterAmount);
    }
}
