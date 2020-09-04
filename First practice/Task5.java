package com.company;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 2 стороны:");
        int a = console.nextInt();
        int b = console.nextInt();

        System.out.println(Math.sqrt(a*a + b*b));

    }
}
