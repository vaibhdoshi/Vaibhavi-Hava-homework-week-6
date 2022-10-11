package javaprogrammes;/*
Write a Java program to print the area and perimeter of a rectangle
*/

import java.util.Scanner;

public class RectangleAreaPerimeter14 {

    public static void main(String[] args) {
        float w, h, a, p;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width");
        w = scanner.nextFloat();
        System.out.println("Enter height");
        h = scanner.nextFloat();
        a = w * h;
        p = 2 * (w + h);
        System.out.println("Area = " + a);
        System.out.println("Perimeter = " + p);


    }


}

