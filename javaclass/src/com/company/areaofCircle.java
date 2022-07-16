package com.company;
import java.util.*;

class circle{
    float radius, PI = 3.14f, area;

    void setRadius(float r){
        radius = r;
    }
    void showArea(){
        area = radius * radius * PI;
        System.out.println("Area of circle is : " +area);
    }

}
public class areaofCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle c = new circle();
        System.out.println("Enter the radius of cicle : ");
        float radius = sc.nextFloat();
        c.setRadius(radius);
        c.showArea();

    }


}
