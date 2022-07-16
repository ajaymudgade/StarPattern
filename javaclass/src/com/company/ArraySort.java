package com.company;
import java.util.*;

class Sort
{
    int arr[], temp;

    void acceptArray(int x[]) {
        arr = x;
    }

    void beforeSorting()
    {
        System.out.println("Before sorting:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    void applySorting()
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    void afterSorting()
    {
        System.out.println("After sort");
        for (int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }


}
public class ArraySort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter values in array:");
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Sort s = new Sort();

        s.acceptArray(arr);

        s.beforeSorting();

        s.applySorting();

        s.afterSorting();


    }
}
