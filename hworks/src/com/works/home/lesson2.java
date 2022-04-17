package com.works.home;

public class lesson2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        int c = a + b;

        if (c >= 10 && c <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        posOrNeg();
        trueOrFalse();
        printWordNTimes();
    }


    public static void posOrNeg() {
        int a = 7;
        if (a >= 0) {
            System.out.println("a is positive");
        } else {
            System.out.println("a is negative");
        }
    }

    public static void trueOrFalse() {
        int y = 6;
        if (y >= 0)
        { System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public static void printWordNTimes() {
        int string = 1;
        int a = 0;
        for (a=0;a <=3;a++) {
            System.out.println(string);}
    }



}

