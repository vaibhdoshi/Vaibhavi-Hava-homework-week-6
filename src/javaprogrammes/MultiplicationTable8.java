package javaprogrammes;
/*Write a Java program that takes a number as input and prints its
multiplication table up to 10 */

import java.util.Scanner;

public class MultiplicationTable8 {

    public static void main(String[] args) {
        //Multiplication table
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));


        }


    }
}
