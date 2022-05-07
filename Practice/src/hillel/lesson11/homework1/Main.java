package hillel.lesson11.homework1;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car();
        cars[1] = new Car(2020);
        cars[2] = new Car("orange");
        cars[3] = new Car(2002, "black");

        for (Car car : cars) {
            car.print();
            System.out.println();
        }
    }
}
