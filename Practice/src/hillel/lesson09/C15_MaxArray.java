package hillel.lesson09;

public class C15_MaxArray {
    public static void main(String[] args) {
        // На 7 строке создаем массив целочисленных элементов с именем array размерностью в 10 элементов

        int[] list = {37, 45, 45, 100, 100, 100, -7, -9, 2, 0, 11, -35, -35};

        // На 11 строке создаем целочисленную переменную max и заносим в неё число, которое содержится в нулевом индексе массива

        int max = list[0];
        int amount = 0;
        // На 15 строке пробегаемся по всему массиву и на 16-й строке проверяем, массив с i-м индексом больше ли значения переменной max
        // На 17 строке если переменная max меньше значения list[i], то присваиваем ей это число
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
                amount = 0;
            }
            if(list[i] == max){
                amount++;
            }
        }
        System.out.println("Max is " + max);
        System.out.println(amount);
    }
}
