package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        Digit digit = new Digit(6);
//        digit.conclusion(1);

//        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 72};
//
//        int lenOfList = (int) (10 / 0.001);
//        double[] rootArray = new double[lenOfList];
//
//        double x = 0;
//        for (int i = 0; i < lenOfList; i += 1) {
//            x += 0.001;
//            rootArray[i] = x;
//        }
//
//        Arrays.sort(array);
//        Find find = new Find(array, rootArray);
//
//        System.out.println(find.search(0, 12, 0));
//
//        System.out.println(find.searchBinary(0, array.length, 12, 0));
//
//        System.out.println(find.searchRoot(0, rootArray.length, 0));
////

        BinaryTree tree = new BinaryTree(10);
        tree.insertLeft(7);
        tree.getLeftChild().insertLeft(5);
        tree.getLeftChild().insertRight(9);
        tree.insertRight(11);
        System.out.println(tree.search(45));
        System.out.println(tree.print(tree));
    }
}



