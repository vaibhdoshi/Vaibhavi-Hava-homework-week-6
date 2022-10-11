package javaprogrammes;
/*Write a Java program to convert a decimal number to binary number.
Input Data:
 Input a Decimal Number : 5
Expected Output
Binary number is: 101
*/

public class Question17 {
    public static void main(String[] args) {
        int a = 5;
        String bin_num;
        bin_num=Integer.toBinaryString(a);//converting decimal number to binary string
        System.out.println("Binary number is : " + bin_num);

    }
}
