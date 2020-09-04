package com.company;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
        double x = console.nextDouble();
        int count = 0;
        while (x > 8) {
            x-= 10;
            count++;
        }
        System.out.println(count);

    }
}
