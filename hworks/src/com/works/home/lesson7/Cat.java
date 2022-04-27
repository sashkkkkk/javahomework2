package com.works.home.lesson7;

public class Cat {

    private int appetit;
    private String name;
    public boolean hungry;

    public Cat(String name, int appetit){
        this.appetit = appetit;
        this.name = name;
        this.hungry = true;
    }

    public int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plate plate){
        plate.decrease(appetit);
        hungry = false;
    }

    public void info(){
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }


}
