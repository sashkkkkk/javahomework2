package com.works.home;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {

    Random rd;
    Scanner sc;
    char[][] field;

    lesson4(){
    field = new char[3][3];
    rd = new Random();
    sc = new Scanner(System.in);
    }

    public static void main(String[] args){
    new lesson4().game();
    }

void game() {
    System.out.println("START");
    initF();
    printF();

        while(true){
            turnHuman();
            if(checkWin('x')){
                printF();
                System.out.println("Human's victory");
                break;
            }
            if(isFieldFull()){
                System.out.println("DRAW");
                break;
            }
            turnAI();
            printF();
            if(checkWin('o')){
                System.out.println("AI victory");
                break;
            }
        }

}

    boolean isFieldFull() {
        for( int x = 0; x < 3;x++) {
            for (int y = 0; y < 3; y++) {
                if(field[x][y] == '.') return false;
            }
        }
        return true;
    }

    void turnHuman() {
        int x, y;

            System.out.println("Enter x y from[0..2]");
            x = sc.nextInt();
            y = sc.nextInt();
            if(isCellValid(x, y)) field[x][y] = 'x';
                    else turnHuman();
    }

    boolean isCellValid(int x,int y){
        if(x < 0 || y < 0 || x >2 || y > 2){
    return false;}
        return field[x][y] == '.';
    }

    void turnAI() {
        int x,y;

            x = rd.nextInt(3);
            y = rd.nextInt(3);
          if(isCellValid(x,y)) field[x][y] = 'o';
    }

    boolean checkWin(char x) {
        if(field[0][0] == x && field[0][1] == x && field[0][2] == x) return true;
        if(field[1][0] == x && field[1][1] == x && field[1][2] == x) return true;
        if(field[2][0] == x && field[2][1] == x && field[2][2] == x) return true;

        if(field[0][0] == x && field[1][0] == x && field[2][0] == x) return true;
        if(field[0][1] == x && field[1][1] == x && field[2][1] == x) return true;
        if(field[0][2] == x && field[1][2] == x && field[2][2] == x) return true;

        if(field[0][0] == x && field[1][1] == x && field[2][2] == x) return true;
        if(field[0][2] == x && field[1][1] == x && field[2][0] == x) return true;

        return false;
    }

    void initF () {
        for( int x = 0; x < 3;x++) {
            for (int y = 0; y < 3; y++) {
                field[x][y] = '.';
            }
        }

}

void printF() {
    for( int x = 0; x < 3;x++) {
        for (int y = 0; y < 3; y++) {
           System.out.print(field[x][y] + " ");
        }
        System.out.println();
    }
    }

}
