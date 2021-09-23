package com.company;

public class Task_10 {
    public static void main(String[] args) {
        int[] a = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        int[] b = new int[a.length];
        int n = a.length - 1;
        int count = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                b[n] = a[i];
                n--;
            } else count++;
        }
        for (int i = 0; i < count; i++) {
            b[i] = 0;
        }
        for(int el:b){
            System.out.print(el+" ");
        }
    }
}
