package com.company;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min=2^32;
        for(int i=0;i<3;i++){
           int a= scanner.nextInt();
           if (a<min) min=a;
        }
        System.out.println(min);
    }
}