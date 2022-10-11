package javaprogrammes;/*Write a Java program to swap two variables.
 */

public class SwapTwoVariables {

    public static void main(String[] args) {
        int a = 10, b = 20;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a =" + a);
        System.out.println("b =" + b);


    }

}
