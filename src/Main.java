public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age = 15;
        byte adult = 18;
        if (age >= adult) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte temperature = -2;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        short speed = 200;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte age = 5;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte age = 13;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte numberOfPassengers = 61;
        byte totalSeats = 102;
        byte seating = 60;
        boolean standingPlace = numberOfPassengers > seating && numberOfPassengers <= totalSeats;
        if (standingPlace) {
            System.out.println("В вагоне остались только стоячие места");
        }
        if (numberOfPassengers <= seating) {
            System.out.println("В вагоне имеются свободные сидячие места");
        } else if (numberOfPassengers > totalSeats) {
            System.out.println("В вагоне нет свободных мест");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 540;
        int two = 140;
        int three = 100;
        if (one > two && one > three) {
            System.out.println("Значение переменной one " + one + " является наибольшим");
        } else if (two > one && two > three) {
            System.out.println("Значение переменной two " + two + " является наибольшим");
        } else {
            System.out.println("Значение переменной three " + three + " является наибольшим");
        }
    }
}