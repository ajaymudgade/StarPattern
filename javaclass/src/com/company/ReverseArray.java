package com.company;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);
        int a[];
        a = new int[5];
        System.out.println("Enter five elements in array");

        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Before the array values");
        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("a[%d] ---> %d\n",i, a[i]);
        }

        int mid = (a.length/2);
        int end = (a.length - 1);

        for (int start = 0; start < mid; start++)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            end--;
        }

        System.out.println("After Reverse array ");

        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("a[%d] ---> %d\n", i, a[i]);
        }
    }
}
