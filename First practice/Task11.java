package com.company;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        double a = console.nextDouble();
        double b = console.nextDouble();


        System.out.println(Math.sqrt(a * b));

    }
}
