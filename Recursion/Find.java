package com.company;

public class Find {
    int [] array;
    double[] arrayRoot;

    public Find(int [] array, double [] arrayRoot) {
        this.array = array;
        this.arrayRoot = arrayRoot;
    }

    public boolean search(int i, int value, int count){
        System.out.println("count = " + count);
        if (this.array[i] == value)
            return true;
        if (i == this.array.length - 1)
            return false;
        return search(i + 1, value, count + 1);
     }

    public boolean searchBinary(int first, int last, int value, int count){
        int middle = (first + last) / 2;
        System.out.println("count = " + count);

        if (this.array[middle] == value)
            return true;
        if (middle == 1)
            return false;
        if (value < this.array[middle])
            return searchBinary(first, middle, value, count + 1);
        else
            return searchBinary(middle, last,  value, count + 1);
    }

    public double equationValue(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    public boolean searchRoot(int first, int last, int count) {

        int middle = (first + last) / 2;
//        System.out.println("middle = " + middle);
        System.out.println("count = " + count);

        System.out.println(this.arrayRoot[middle]);
        if ((int) equationValue(this.arrayRoot[middle]) == 0)
            return true;
        if (middle == 1)
            return false;
        if (equationValue(this.arrayRoot[middle]) < 0)
            return searchRoot(middle, last, count + 1);
        else
            return searchRoot(first, middle, count + 1);
    }
}
