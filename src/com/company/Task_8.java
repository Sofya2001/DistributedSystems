package com.company;

public class Task_8 {
    public static void main(String[] args) {
        int[] a={1,-10,5,6,45,23, 45,-34,0,32,56,-1,2,-2};
        int max=a[0];
        int sum_p=0;
         int count_p=0;
        int sum_o=0;
        double sum_all_otr=0;
        double count_otr=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>max) max=a[i];
            if (a[i]>0) {sum_p=sum_p+a[i];count_p++;}
            if (a[i]<0 && a[i]%2==0) sum_o=sum_o+a[i];
            if (a[i]<0) {sum_all_otr=sum_all_otr+a[i];count_otr++;}
        }
        System.out.printf("максимальное значение : %d, сумма положительных элементов : %d, сумма четных отрицательных элементов : %d, количество положительных элементов : %d, среднее арифметическое отрицательных элементов : %f \n",max,sum_p,sum_o,count_p,sum_all_otr/count_otr);



    }
}
