package com.skyPro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10(2);
    }

    public static void task1() {
        System.out.println("\nЗадача_1");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {
        System.out.println("\nЗадача_2");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("\nЗадача_3");
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0)
                System.out.print(" " + i);
        }
    }

    public static void task4() {
        System.out.println("\nЗадача_4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(" " + i);
        }
    }

    public static void task5() {
        System.out.println("\nЗадача_5");
        System.out.println("Високостные года с 1904 по 2096");
        for (int i = 1904; i <= 2096; i++) {
            if ((i % 4 == 0) && (i % 100 != 0 || i % 400 == 0)) {
                System.out.print(" " + i);
            }
        }

    }

    public static void task6() {
        System.out.println("\nЗадача_6");
        for (int i = 0; i <= 98; i = i + 7) {
            System.out.print(" " + i);
        }
    }

    public static void task7() {
        System.out.println("\nЗадача_7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(" " + i);
        }
    }

    public static void task8() {
        System.out.println("\nЗадача_8");
        int cashSavings = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + cashSavings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
    }

    public static void task9() {
        System.out.println("\nЗадача_9");
        int cashSavings = 29_000;
        double total = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            total = (total + cashSavings) * (1 + percent);
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
    }

    public static void task10(int number) {
        System.out.println("\nЗадача_10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}