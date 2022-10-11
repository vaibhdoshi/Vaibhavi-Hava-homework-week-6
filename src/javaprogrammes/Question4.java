package javaprogrammes;
/*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme
 */
public class Question4 {
    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;

    public static void main(String[] args) {
        Question4 a = new Question4();
        a.myMethod();
        car();
    }
    public void myMethod() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void car() {
        Question4 obj = new Question4();
        System.out.println(obj.a);
        Question4 t = new Question4();
        System.out.println(t.b);
        System.out.println(c);
        System.out.println(d);

    }

}
