package com.company;

import java.util.*;

public class TwoDArray {
    public static void main(String[] x){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int [3][3];
        System.out.println("Enter the values in matrix");

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Display the matrix");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                System.out.printf("a[%d] ---> %d\n", i, a[i][j]);
            }
            System.out.println("");
        }
    }
}
