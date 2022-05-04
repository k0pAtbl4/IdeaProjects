package lesson11.homework3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
        this(0, 0.0, 0, "default");
    }

    public Car(int year) {
        this(year, 0.0, 0, "default");
    }

    public Car(int year, double speed) {
        this(year, speed, 0, "default");
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "default");
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
