package com.company;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        if(a==0) System.out.println("Нулевое число");
        else if(a%2==0 && a>0)System.out.println("Положительное четное число");
        else if(a%2!=0 && a>0)System.out.println("Положительное нечетное число");
        else if(a%2!=0 && a<0)System.out.println("Отрицательное нечетное число");
        else System.out.println("Отрицательное четное число");
    }
}
