package hillel.lesson9;

import java.util.Arrays;

public class C03_ArraysFill {
    // Массивы (одномерный массив).

    public static void main(String[] args) {
        // На 10 строке создаем массив целочисленных элементов с именем array
        // и заполняем его значениями 1,2,3,4,5

        int[] array = new int[]{1, 2, 3, 4, 5};

        int l = array.length; //5
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;


        System.out.println(Arrays.toString(array));
        System.out.println(array);


        // Вывод на экран значений элементов массива.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
