package com.company;

public class Digit {
    int n;

    public Digit(int n) {
        this.n = n;
    }

    public void conclusion(int n) {
        System.out.println(n);
        if (n == this.n)
            return;
        conclusion(n + 1);
    }
}
