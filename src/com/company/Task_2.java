package com.company;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        while (a > 0) {
            sum = sum + (a % 10);
            a = a / 10;
        }
        System.out.println(sum);
    }
}
