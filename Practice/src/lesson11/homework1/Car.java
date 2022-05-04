package lesson11.homework1;

public class Car {
    private int year;
    private String color;

    public Car(){
        year = 0;
        color = "default";
    }

    public Car(int year){
        this.year = year;
        color = "default";
    }

    public Car(String color){
        year = 0;
        this.color = color;
    }

    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }

    void print(){
        System.out.println("year: " + year + "\ncolor: " + color);
    }

}
