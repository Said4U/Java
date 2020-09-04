package com.company;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите координаты 1 точки:");
        double a1 = console.nextDouble();
        double b1 = console.nextDouble();

        System.out.println("Введите координаты 2 точки:");
        double a2 = console.nextDouble();
        double b2 = console.nextDouble();

        System.out.println("Ответ: " + Math.sqrt((a1 - a2)*(a1 - a2) + (b1 - b2)*(b1 - b2)));

    }
}
