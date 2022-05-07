package hillel.lesson11.homework3;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car();
        cars[1] = new Car(1970);
        cars[2] = new Car(2015, 264);
        cars[3] = new Car(2021, 235, 2000);
        cars[4] = new Car(2022, 400, 1700, "yellow");

        for (Car car : cars) {
            car.print();
            System.out.println();
        }

        for(Car car : cars) {
            System.out.println(car.getColor());
        }

        System.out.println();

        for(Car car : cars) {
            car.setColor("changed");
        }

        for (Car car : cars) {
            car.print();
            System.out.println();
        }
    }
}
