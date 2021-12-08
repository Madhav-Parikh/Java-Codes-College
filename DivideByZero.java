import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        int a;
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        a = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        b = sc.nextInt();

        try {
            System.out.println("a/b : " + a / b);
        }
        catch(ArithmeticException e) {
            System.out.println("Exception occurred: " + e);
            System.out.println("ArithmeticException occurred due to division by zero.");
        }
    }
}
