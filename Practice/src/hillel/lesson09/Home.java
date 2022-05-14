package hillel.lesson09;

public class Home {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        Car arrOfCars[] = new Car[5];
        Car bmw = new Car();
        arrOfCars[0] = bmw;
    }
}

class Car{
    private int id;
    private String name;
}
