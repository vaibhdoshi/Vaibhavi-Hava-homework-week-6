package javaprogrammes;
/*2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
*/
public class Question2 {
    static int a = 10;//static variable
    static int b = 20;//static variable

    public static void main(String[] args) {
        car();

    }

    //static method
    public static void car() {
        System.out.println(a);
        System.out.println(b);
    }

}

