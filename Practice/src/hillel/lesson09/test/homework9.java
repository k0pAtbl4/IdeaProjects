package hillel.lesson09.test;
import java.util.Arrays;
import java.util.Random;

public class homework9 {

    static int[] ArrayRandomization(int[] array, Random number){
        for(int i = 0; i < array.length; i++) {
            array[i] = number.nextInt(-10, 11);
        }
        return array;
    }

    static int MinElementAmount(int[] array){
        int min = array[0];
        int count = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                count = 0;
            }
            if(array[i] == min){
                count++;
            }
        }
        System.out.println("Min element is: " + min);
        return count;
    }

    static int MaxElementAmount(int[] array){
        int max = array[0];
        int count = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                count = 0;
            }
            if(array[i] == max){
                count++;
            }
        }
        System.out.println("Max element is: " + max);
        return count;
    }

    public static void main(String[] args) {
        Random number = new Random();
        int[] randomArray = new int[20];
        randomArray = ArrayRandomization(randomArray, number);
        System.out.println(Arrays.toString(randomArray));
        System.out.println();
        System.out.println("Amount of min elements = " + MinElementAmount(randomArray));
        System.out.println();
        System.out.println("Amount of max elements = " + MaxElementAmount(randomArray));
    }
}
