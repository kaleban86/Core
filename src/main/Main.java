package main;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        int[] data = {1,0,55};

        for (int barrier = data.length - 1; barrier >= 1; barrier--) {


            conditionalSwap(data, barrier);
        }
        System.out.println(Arrays.toString(data));
    }

    private static void conditionalSwap(int[] data, int barrier) {
        for (int index = 0; index < barrier; index++) {

            if (data[index] > data[index + 1]) {
                swap(data, index);
            }
        }
    }


    private static void swap(int[] array, int i) {
        int tmp = array[i];
        array[i] = array[(i + 1)];
        array[(i + 1)] = tmp;
    }
}
