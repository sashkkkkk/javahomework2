package com.works.home.lesson7;

public class Plate {
    private int food;

    public Plate(int food){
        this.food=food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Еды в миске " + food);
    }

    public boolean decrease(int amount){
        food -= amount;
        if(food < 0){
            return true;
        } return false;
    }

    public void increase(int amount){
         food += amount;
    }

}
