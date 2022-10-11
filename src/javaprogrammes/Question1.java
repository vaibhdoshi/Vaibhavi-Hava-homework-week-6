package javaprogrammes;
/*1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Question1 {
    int a = 10; //instance variable
    int b = 20;//instance variable

    //instance method calling into main method
    public static void main(String[] args) {
        Question1 obj = new Question1();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }

    //2.instance method
    public void myMethod() {
        System.out.println(a);
        System.out.println(b);
    }


}
