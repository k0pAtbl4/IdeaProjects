package hillel.lesson8;

public class C07_MethodsBinaryDigit {
    // Вывод в двоичном формате числа, переданного в десятичном формате

    public static void main(String[] args) {
        int n = 3;

        System.out.println(n % 3);

        //converter(n);
    }

    static void converter(int n) {
        int temp;

        temp = n % 2;

        if (n >= 2) {
            converter(n / 2);
        }

        System.out.print(temp);
    }
}
