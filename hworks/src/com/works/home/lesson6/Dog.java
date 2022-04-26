package com.works.home.lesson6;

public class Dog extends Animal {

    int swimDist;
    int runDist;

    public Dog(String name, String color, int age, int runDist, int swimDist) {
        super(name, color, age);
        this.runDist = runDist;
        this.swimDist = swimDist;
    }

    public void swim(){
        if(swimDist < 10) {
            System.out.println("Пес плывет " + swimDist + "м");
        } else {
            System.out.println("Пес плывет не более 10м");
        }
    }

    public void run() {
        if (runDist < 500) {
            System.out.println("Пес бежит " + runDist + "м");
        }else {
            System.out.println("Пес бежит не более 500м");
        }
    }


}
