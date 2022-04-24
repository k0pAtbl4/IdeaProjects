package lesson7;

public class C03_Methods {

    private static String function() {
        String word = "Hello!";
        return word;
    }

    public static void main(String[] args) {

        // В теле метода Main на 15-й строке, создаем строковую локальную переменную с именем string
        // и присваиваем ей возвращаемое значение метода function.

        String string = function();
        String string1 = function();
        System.out.println(function());
    }
}
