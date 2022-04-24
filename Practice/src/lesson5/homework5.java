package lesson5;
import java.util.Scanner;
//--------------------------------------------------
public class homework5 {
    static void method1(boolean a, boolean b){
        System.out.println(!a & !b);
        System.out.println(!(a | b));
        System.out.println();
    }

    static void method2(boolean a, boolean b){
        System.out.println(!a & b);
        System.out.println(!(a | !b));
        System.out.println();
    }

    static void method3(boolean a, boolean b){
        System.out.println(a & !b);
        System.out.println(!(!a | b));
        System.out.println();
    }

    static void method4(boolean a, boolean b){
        System.out.println(a & b);
        System.out.println(!(!a | !b));
        System.out.println();
    }

    static void method5(boolean a, boolean b){
        System.out.println(!a | !b);
        System.out.println(!(a & b));
        System.out.println();
    }

    static void method6(boolean a, boolean b){
        System.out.println(!a | b);
        System.out.println(!(a & !b));
        System.out.println();
    }

    static void method7(boolean a, boolean b){
        System.out.println(a | !b);
        System.out.println(!(!a & b));
        System.out.println();
    }

    static void method8(boolean a, boolean b){
        System.out.println(a | b);
        System.out.println(!(!a & !b));
        System.out.println();
    }
    //------------------------------------------------------
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое значение:\n[1] - True\n[2] - False");
        int aInt = input.nextInt();
        switch(aInt){
            case 1:
                a = true;
                break;
            case 2:
                a = false;
                break;
            default:
                System.out.println("Вы ввели неверное значение. Значение по умолчанию = true");
                a = true;
        }

        System.out.println("Введите второе значение:\n[1] - True\n[2] - False");
        int bInt = input.nextInt();
        switch(bInt){
            case 1:
                b = true;
                break;
            case 2:
                b = false;
                break;
            default:
                System.out.println("Вы ввели неверное значение. Значение по умолчанию = true");
                b = true;
        }
        method1(a, b);
        method2(a, b);
        method3(a, b);
        method4(a, b);
        method5(a, b);
        method6(a, b);
        method7(a, b);
        method8(a, b);


    }
}
