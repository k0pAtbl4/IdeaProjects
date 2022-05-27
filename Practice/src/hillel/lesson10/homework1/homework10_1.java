package hillel.lesson10.homework1;

import java.util.Scanner;

public class homework10_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle inputShape = new Rectangle();
        int operationCondition = 1;
        while(operationCondition == 1){
            System.out.println("Введите длину вертикальной стороны:");
            inputShape.setOy(input.nextInt());
            System.out.println("Введите длину горизонтальной стороны");
            inputShape.setOx(input.nextInt());
            System.out.println("Площадь прямоугольника: " + inputShape.areaCalculator());
            System.out.println("Периметр прямоугольника: " + inputShape.perimeterCalculator());
            System.out.println("Хотите ввести данные ещё одного прямоугольника?\n[1] - Да\n[2] - Нет");
            operationCondition = input.nextInt();
        }
    }
}

