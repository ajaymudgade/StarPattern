package com.company;
import java.util.*;

public class Factorial {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num, fact = 1;

        System.out.println("Enter the number  : ");

        num = sc.nextInt();

        for (int i = 1; i <= num ; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of number is " +fact);
    }
}
