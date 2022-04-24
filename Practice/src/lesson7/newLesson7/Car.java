package lesson7.newLesson7;

import java.util.Objects;

public class Car {
    private int id;
    private String name;
    private int speed;
    private String color;
    private String model;

    public Car(){
        id = 5;
        name = "default";
        speed = 0;
        color = "default";
        model = "default";
    }

    public Car(int id, String name, int speed, String color, String model) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.color = color;
        this.model = model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && speed == car.speed && Objects.equals(name, car.name) && Objects.equals(color, car.color) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, speed, color, model);
    }

    public String getModel() {
        return model;
    }
    public static void main(String[] args) {
        Car audi = new Car();
        System.out.println(audi);
        Car bmw = new Car(25, "m6", 2, "black", "m6");
        System.out.println(bmw);


    }
}
