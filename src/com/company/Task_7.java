package com.company;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a){
            case 905: System.out.println("Москва. Стоимость разговора: "+ 4.15*10); break;
            case 194: System.out.println("Ростов. Стоимость разговора: "+1.98*10); break;
            case 491: System.out.println("Краснодар. Стоимость разговора: "+2.69*10); break;
            case 800: System.out.println("Киров. Стоимость разговора: "+5*10); break;
            default: System.out.println(" Информации о данном коде нет"); break;
        }
    }
}
