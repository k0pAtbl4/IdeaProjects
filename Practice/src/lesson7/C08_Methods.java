package lesson7;

public class C08_Methods {
    // Пример: Использование сторожевого оператора, для защиты номинального варианта.

    static String function(String name) {
        // Выполняем проверку. При обнаружении ошибок завершаем работу.
        String st = "Hello";
        String st1 = "Hello";

        String str = new String("Hello");
        String str1 = new String("Hello");
        System.out.println(st == st1);              //сравнивает ссылки
        System.out.println(str.equals(str1));       //сравнивает значения

        if (name == "fool") {  // Сторожевой оператор.
            return "Вы использовали недопустимое слово.";
        }

        // Код номинального варианта.

        String sentence = "Hello " + name + "!";

        return sentence;
    }

    public static void main(String[] args) {
        String sentence = function("fool");

        System.out.println(sentence);
    }
}
