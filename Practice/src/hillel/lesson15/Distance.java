package hillel.lesson15;

public class Distance {
    private double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    void print(){

    }

    static class Converter{
        void toCentimeter(double a){
            System.out.println("In centimeters: " + (a * 10));
        }
        void toMeter(double a){
            System.out.println("In meters: " + (a * 1000));
        }
    }
}
