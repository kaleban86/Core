package main;

import java.util.Arrays;

public class SortArray {


    public static void main(String[] args) {


        getF(1);


    }

    private static void getF(int a) {

        System.out.print(" " + a);

        if (a  < 9){
            getF(a + 1);
        }
        System.out.print(" " + a);
    }


}
