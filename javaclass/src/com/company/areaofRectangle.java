package com.company;
import java.util.*;

class Rectangle{
    int len, wid;

    void setLenWid(int l, int w){
        len = l;
        wid = w;
    }

    void showArea(){
        System.out.println("Area of Rectangle is : " +(len * wid));
    }
}

public class areaofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();

        System.out.println("Enter the length and width of Rectangle:");
        int len = sc.nextInt();
        int wid = sc.nextInt();

        r.setLenWid(len, wid);
        r.showArea();
    }



}
