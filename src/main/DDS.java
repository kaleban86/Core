package main;

import java.util.Arrays;

public class DDS {


    public static void main(String[] args) {

        Node tail = null;

        tail = new Node(0,tail);
        tail= new Node(1,tail);
        tail = new Node(2,tail);
        tail = new Node(3,tail);


        generateIter0(50);

        
    }

    public static Node generateIter0( int max){

        Node result = null;

        for (int i = 0; i <= max ; i++) {

            result = new Node(i , result);
        }

        System.out.println(max);
        return result;
    }
}
