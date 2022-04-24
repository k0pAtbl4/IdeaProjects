package Practice;
import java.util.Scanner;

public class Stolovaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int r = a * n;
        int k = b * n;
        if(k >= 100)
        {
            int hundredAmount = k/100;
            k = k - (hundredAmount * 100);
            r = r + hundredAmount;
        }
        System.out.println(r + " " + k);
    }
}
