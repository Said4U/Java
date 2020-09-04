package com.company;

public class Task4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a;
        a = b;
        b = c;
        System.out.println("Первый способ: a = " + a + " b = " + b);
        a = a ^ b ^ (b = a);
        System.out.print("Второй способ: a = " + a + " b = " + b);


    }
}

