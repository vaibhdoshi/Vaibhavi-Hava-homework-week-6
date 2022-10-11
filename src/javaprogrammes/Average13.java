package javaprogrammes;
/*Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */

import java.util.Scanner;

public class Average13 {

    public static void main(String[] args) {
        int a, b, c;
        double av;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        av = (a + b + c) / 3.0;
        System.out.println("average of 3 numbers :  " + av);


    }

}
