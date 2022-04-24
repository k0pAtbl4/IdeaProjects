package com.hillel.javaStarter.test;

import java.util.Arrays;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 6, 8, 4, 5, 7};

//        System.arraycopy(arr, 3, arr, 2, 3);
        arr = Arrays.copyOf(arr, 5);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
