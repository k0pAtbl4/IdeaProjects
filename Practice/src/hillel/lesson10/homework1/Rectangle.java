package hillel.lesson10.homework1;

public class Rectangle {
        private double ox;
        private double oy;

        public double getOx() {
            return ox;
        }

        public void setOx(double ox) {
            this.ox = ox;
        }

        public double getOy() {
            return oy;
        }

        public void setOy(double oy) {
            this.oy = oy;
        }

        public double areaCalculator(){
            return ox * oy;
        }

        public double perimeterCalculator(){
            return (ox * 2) + (oy * 2);
        }
}
