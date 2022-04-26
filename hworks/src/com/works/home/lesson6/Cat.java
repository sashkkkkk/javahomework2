package com.works.home.lesson6;

public class Cat extends Animal {

    int runDist;

    public Cat(String name, String color, int age, int runDist) {
        super(name, color, age);
        this.runDist = runDist;
    }

    public void swim(){
        System.out.println("Кот не умеет плавать " );
    }

    public void run() {
        if (runDist < 200) {
            System.out.println("Кот бежит " + runDist + "м");
        } else {
            System.out.println("Кот не бежит больше 200м");
        }
    }

}
