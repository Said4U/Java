package com.company;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
        double a = console.nextDouble();
        double b = Math.floor(a);

        System.out.println(Math.floor((a - b) * 10));

    }
}
