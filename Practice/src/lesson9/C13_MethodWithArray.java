package lesson9;

public class C13_MethodWithArray {
    static int[] modifyArray(int[] array, int modifier) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= modifier;   //array = array * modifier
        }
        return array;
    }

    static void module(Integer a){
        int temp = a;
        a = a * a;
        a = a / temp;
        //return a;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        Integer a = -10;
        module(a);
        System.out.println(a);
        modifyArray(myArray, 5); //5, 10, 15, 20, 25

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
    }
}
