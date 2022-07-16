package com.company;

import java.util.*;

public class ArrayPrinting {
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

        System.out.println("Display the array values");
        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("a[%d] ---> %d\n",i, a[i]);
        }

    }
}
