package hillel.lesson14;

import java.util.Arrays;

public class MyArrayList {
    public Object[] array = new Object[1];

    public MyArrayList(Object a){
        array[0] = a;
    }

    public void add(Object value){
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = value;
    }

    public void remove(int index){
        if(array.length - 1 >= index) {
            System.arraycopy(array, index + 1, array, index, array.length - index - 1);
            array = Arrays.copyOf(array, array.length - 1);
        } else {
            System.out.println("Error");
        }
    }

    public void clear(){
        array = Arrays.copyOf(array, 0);
    }

    public int size(){
        return array.length;
    }

    public Object get(int index){
        if(array.length - 1 >= index) {
            return array[index];
        } else {
            return "Error";
        }
    }

    public void printArray(){
        System.out.println(Arrays.toString(array));
    }
}
