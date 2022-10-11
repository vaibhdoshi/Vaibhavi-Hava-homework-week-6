package javaprogrammes;
/*. Write a program to calculate the area of a triangle.*/
import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        float b,h,Area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base and height value");
        b = scanner.nextFloat();
        h = scanner.nextFloat();
        //area = (base * height) / 2;
        Area = (b * h) / 2;
        System.out.println("Area of triangle is: " + Area);

    }
}
