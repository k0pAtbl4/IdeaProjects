package nulp.ch_m;

public class lab08 {
    public static int xNext;

    double f(int x) {
        return x;
    }

    double deltaF(int poryadok, int x) {
        double result;
        if(poryadok >= 2) {
            for (int i = poryadok - 1; i > 0; i++) {
                result = deltaF(i, xNext) - deltaF(i, x);
            }
        }
        if(poryadok == 1){
        }
        return x;
    }
}
