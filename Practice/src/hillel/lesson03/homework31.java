package hillel.lesson03;

public class homework31 {
    public static void main(String[] args) {
        char ch = '0';

        while (ch <= 9)

            System.out.print(ch++);
    }
}
//программа не запустится, потому что ch - переменная типа char, и при сравнивании с целочисленными значениями,
//переменная берет числовое значение символа 0 в таблице ASCII, которое == 48