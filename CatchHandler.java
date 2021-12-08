import java.util.Scanner;

public class CatchHandler {
    public static void main(String[] args) {

        int a;
        int b;
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        b = sc.nextInt();

        str = "Hey there, welcome to the program.";

        System.out.print("Enter the index to get the character in the string: ");
        int str_index = sc.nextInt();

        int[] age = new int[3];
        age[0] = 18;
        age[1] = 42;
        age[2] = 39;

        System.out.print("Enter an index to get the associated age: ");
        int index = sc.nextInt();

        try{
            System.out.println(age[index]);
            try{
                System.out.println(str.charAt(str_index));
                try{
                    System.out.println("a/b is " + a/b);
                }
                catch(ArithmeticException ae){
                    System.out.println("ArithmeticException occurred due to division by zero: " + ae);
                }
            }
            catch(StringIndexOutOfBoundsException si){
                System.out.println("StringIndexOutOfBoundsException occurred due to invalid index: " + si);
            }
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println("ArrayIndexOutOfBoundsException occurred due to invalid index: " + ai);
        }
    }
}
