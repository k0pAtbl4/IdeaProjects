package hillel.lesson10;
import java.util.Scanner;

public class homework10_1 {
    static double areaCalculator(double side1, double side2){
        return side1 * side2;
    }

    static double perimeterCalculator(double side1, double side2){
        return (side1 * 2) + (side2 * 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle inputShape = new Rectangle();
        int operationCondition = 1;
        while(operationCondition == 1){
            System.out.println("Введите длину вертикальной стороны:");
            inputShape.setOy(input.nextInt());
            System.out.println("Введите длину горизонтальной стороны");
            inputShape.setOx(input.nextInt());
            System.out.println("Площадь прямоугольника: " + areaCalculator(inputShape.getOx(), inputShape.getOy()));
            System.out.println("Периметр прямоугольника: " + perimeterCalculator(inputShape.getOx(), inputShape.getOy()));
            System.out.println("Хотите ввести данные ещё одного прямоугольника?\n[1] - Да\n[2] - Нет");
            operationCondition = input.nextInt();
        }
    }
}

class Rectangle{
    private double ox;
    private double oy;

    public double getOx() {
        return ox;
    }

    public void setOx(double ox) {
        this.ox = ox;
    }

    public double getOy() {
        return oy;
    }

    public void setOy(double oy) {
        this.oy = oy;
    }
}