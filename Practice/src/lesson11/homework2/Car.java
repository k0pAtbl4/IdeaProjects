package lesson11.homework2;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        year = 0;
        speed = 0.0;
        weight = 0;
        color = "default";
    }

    public Car(int year) {
        this.year = year;
        speed = 0.0;
        weight = 0;
        color = "default";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        weight = 0;
        color = "default";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        color = "default";
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    void print(){
        System.out.println("year: " + year + "\nspeed: " + speed + "\nweight: " + weight + "\ncolor: " + color);
    }
}
