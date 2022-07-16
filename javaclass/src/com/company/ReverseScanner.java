package com.company;
import java.util.*;

public class ReverseScanner {
    public static void main(String[] x){

        Scanner sc = new Scanner(System.in);
        int rem, num, rev = 0;

        System.out.println("Enter the number ");

        num = sc.nextInt();

        while(num != 0)
        {
            rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }
        System.out.println("Reverse is " +rev);
    }
}
