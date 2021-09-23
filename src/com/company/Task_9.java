package com.company;

public class Task_9 {
    public static void main(String[] args) {
        int[] a = {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
        int[] b = new int[a.length];
        int n = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[n] = a[i];
            n++;
        }
        for (int el : b) {
            System.out.print(el+" ");
        }
    }
}