package javaprogrammes;
/*Write a Java program to add two binary numbers
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101
 */

public class Binary16 {

    public static void main(String[] args) {
        String a = "10";
        String b = "11";
        String sum;
        int a1 = Integer.parseInt(a, 2);//converting binary string to binary number using java API
        int a2 = Integer.parseInt(b, 2);//converting binary string to binary number using java API
        int total = a1 + a2;//performing sum of two binary numbers
        sum = Integer.toBinaryString(total);//converting binary string to binary number using java API
        System.out.println("sum of two binary numbers: " + sum);


    }
}
