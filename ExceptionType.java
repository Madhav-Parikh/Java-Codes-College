import java.util.Scanner;

class invalidAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be zero, minus or greater than 150.";
    }
}

public class ExceptionType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your age : ");
        boolean flag = true;

        while(flag) {
            int age = sc.nextInt();
            if (age <= 0 || age > 150) {
                try {
                    throw new invalidAgeException();
                } catch (invalidAgeException e) {
                    System.out.println("Error: " + e.toString());
                }
            } else {
                System.out.println("Your age is " + age);
                flag = false;
            }
        }
    }
}
