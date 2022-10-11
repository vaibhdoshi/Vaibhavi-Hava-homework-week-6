package javaprogrammes;

import java.util.Scanner;

/*Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
public class Question18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, res;
        System.out.println("Input the first number");
        num1 = scanner.nextInt();
        System.out.println("Input the second number");
        num2 = scanner.nextInt();
        //sum
        System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
        //subtract
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        //Multiplication
        System.out.println(num1 + "x" + num2 + "= " + (num1 * num2));
        //Division
        System.out.println(num1 + "/" + num2 + "= " + (num1 / num2));
        //mod
        System.out.println(num1 + "%" + num2 + "= " + (num1 % num2));


    }


}
