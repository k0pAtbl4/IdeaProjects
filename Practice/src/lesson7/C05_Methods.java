package lesson7;

public class C05_Methods {
    // Сложение двух целых чисел.

    static byte add(byte summand1, byte summand2) {
        return (byte)(summand1 + summand2);
    }

    public static void main(String[] args) {
        byte summand1 = 2, summand2 = 3;

        int sum = add(summand1, summand2);

        System.out.println(summand1 + " + " + summand2 + " = " + sum);
    }
}
