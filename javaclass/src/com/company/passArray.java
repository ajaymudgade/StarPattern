package com.company;
import java.util.*;

class per{
    int sub[];
    void setMarks(int marks[]){
        sub = marks;
    }

    void calPer(){
        int agg = 0;
        float per;
        for (int i=0; i<sub.length; i++){
            agg = agg + sub[i];
        }

        per = agg/sub.length;
        System.out.println("Percentage is : " +per);
    }
}

public class passArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        System.out.println("Enter the values in an Array:");
        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        per p = new per();
        p.setMarks(a);
        p.calPer();

    }
}
