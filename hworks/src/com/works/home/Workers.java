package com.works.home;

import java.util.Arrays;

public class Workers {

    public String name;
    public String work;
    public String email;
    public int number;
    public int salary;
    public int age;

        public Workers(String name, String work, String email, int number, int salary, int age) {
            this.name = name;
            this.work = work;
            this.email = email;
            this.number = number;
            this.salary = salary;
            this.age = age;
        }

        public String toString() {
            return name + work + email + number + salary + age;
             }



        public static void main(String[] args) {
            Workers[] workersArray = new Workers[5];
            workersArray[0] = new Workers("Иван Иванов", "Инженер", "ii@mail.ru", 91128323, 35000, 27);
            workersArray[1] = new Workers("Сергей Сергеев", "Ст. инженер", "ss@mail.ru", 9823874, 55000, 42);
            workersArray[2] = new Workers("Лена Ленина", "Менеджер", "ll@mail.ru", 9823566, 40000, 27);
            workersArray[3] = new Workers("Петр Петров", "Директор", "pp@mail.ru", 9334567, 80000, 47);
            workersArray[4] = new Workers("Ольга Ольгина", "Бухгалтер", "oo@mail.ru", 9212144, 55000, 41);

            int ag = this.age;

            if (ag > 40) {
                System.out.println(Arrays.toString(workersArray));
            }
        }

    }

