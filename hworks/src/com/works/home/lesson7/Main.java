package com.works.home.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Tom", 2);
        cat[1] = new Cat("Jerry", 2);
        cat[2] = new Cat("Myrzik", 8);
        Plate plate = new Plate(20);


        for(Cat i : cat) {
            if (!plate.decrease(i.getAppetit())){
                i.eat(plate);
                i.info();
                plate.info();
            } else { System.out.println("Не смог поесть "  + i.getName());
            }
        }

        }

    }
