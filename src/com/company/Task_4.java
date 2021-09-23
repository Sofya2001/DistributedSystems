package com.company;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) a++;
        else if (a == 0) a = 10;
        else a = a -2;
        System.out.println(a);
    }
}
