package hillel.lesson14;

import java.util.Arrays;

public class MyArrayList {
    public Object[] array = new Object[1];

    MyArrayList(Object a){
        array[0] = a;
    }

    void add(Object value){
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = value;
    }

    void remove(int index){
        if(array.length - 1 >= index) {
            System.arraycopy(array, index + 1, array, index, array.length - index - 1);
            array = Arrays.copyOf(array, array.length - 1);
        } else {
            System.out.println("Error");
        }
    }

    void clear(){
        array = Arrays.copyOf(array, 0);
    }

    int size(){
        return array.length;
    }

    Object get(int index){
        if(array.length - 1 >= index) {
            return array[index];
        } else {
            return "Error";
        }
    }

    void printArray(){
        System.out.println(Arrays.toString(array));
    }
}
