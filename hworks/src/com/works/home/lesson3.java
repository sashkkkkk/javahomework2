package com.works.home;

import java.util.Arrays;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {

//1
        int[] intArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (intArray[i] > 0) ? 0 : 1;
        }

        System.out.println(Arrays.toString(intArray));


//2
        int[] stoArray = new int[100];
        for (int i = 0; i < stoArray.length; i++) {
            stoArray[i] = i + 1;
        }

        System.out.println(Arrays.toString(stoArray));

//3
        int[] multSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multSix.length; i++) {
            multSix[i] = (multSix[i] < 6) ? multSix[i] * 2 : multSix[i];
        }

        System.out.println(Arrays.toString(multSix));

//4
        int[][] diaInts = new int[3][3];
        for (int i = 0; i < diaInts.length; i++) {
            for (int j = 0; j < diaInts.length; j++) {
                if(i==j) {
                    diaInts[i][j] = 1;
                }
                                }
            System.out.println(Arrays.toString(diaInts[i]));
        }
//5
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int len = sc.nextInt();
        System.out.println("Введите значение массива:");
        int initialValue = sc.nextInt();
        int[] intVal = new int[len];
        for (int i = 0; i < len; i++){
            intVal[i] = initialValue;
        }
        System.out.println(Arrays.toString(intVal));

    }


}





