package hillel.lesson11.homework2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car();
        cars[1] = new Car(2020);
        cars[2] = new Car(2012, 260);
        cars[3] = new Car(2002, 380, 2060);
        cars[4] = new Car(2022, 420, 1570, "blue");

        for (Car car : cars) {
            car.print();
            System.out.println();
        }
    }
}
