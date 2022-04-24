package lesson8;

import java.util.Objects;

public class Car {
    private int id;
    private String name;
    private int speed;
    private String model;
    private int price;

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && speed == car.speed && price == car.price && Objects.equals(name, car.name) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, speed, model, price);
    }*/

    @Override
    public String toString() {
        return "Car{" +
                "\nid=" + id +
                "\nname='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(){
        this(1, "unknown");
    }

    public Car(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public void print(){
        System.out.println(id + "\n" + name);
    }
}

class Main{
    public static void main(String[] args) {
        Car bmw = new Car(12, "Hello");
        Car tesla = new Car(12, "Hello");
        //bmw.setId(0);
        //System.out.println(bmw.getId());
        System.out.println(bmw.equals(tesla));
    }
}