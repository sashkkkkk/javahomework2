package com.works.home.lesson6;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Barsik","white", 2, 22);
        Dog dog = new Dog("Sharik", "brown", 6, 400, 3);

        System.out.println(cat.toString());
        System.out.println(dog.toString());

        cat.swim();
        cat.run();
        dog.swim();
        dog.run();
    }
}
