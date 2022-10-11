package javaprogrammes;
import java.util.Scanner;
/*Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C)
*/
public class CelsiusFah {
    public static void main(String[] args) {
        float temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the tempreture/n");
        temp = scanner.nextFloat();
        temp = ((temp - 32) * 5) / 9;
        System.out.println("Celcius temp is" + temp);
    }

}
