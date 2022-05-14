package hillel.lesson14;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyArrayList test = new MyArrayList(0);
        for(int i = 1; i < 10; i++){
            test.add(i);
        }
        test.add("hello");
        test.printArray();
        System.out.println("Выберите индекс элемента для удаления:");
        int choose = input.nextInt();
        test.remove(choose);
        test.printArray();
        System.out.println("Размер массива:");
        System.out.println(test.size());
        System.out.println("Выберите индекс элемента, который хотите вывести на экран:");
        choose = input.nextInt();
        System.out.println(test.get(choose));
        System.out.println("Массив успешно очищен");
        test.clear();
        test.printArray();
    }
}
