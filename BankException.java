import java.util.Scanner;

public class BankException {

    static class FundsException extends Exception{

        public String getMessage(){
            return "Sorry, Not Sufficient Fund!";
        }
    }
    public static void main(String[] args) throws FundsException{
       
        long deposit;
        long withdrawn;

        System.out.println("Welcome to the Banking Application!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount to be deposited: ");
        deposit = sc.nextLong();
        boolean flag = true;

        try{
            while(flag){
                System.out.print("Enter the amount to be withdrawn: ");
                withdrawn = sc.nextLong();
                deposit = deposit - withdrawn;
                if(deposit < 0) {
                    throw new FundsException();
                }
            }
        }
        catch(FundsException ife) {
            System.out.println(ife.getMessage());
        }
        finally {
            System.out.println("Press enter to exit the application.");
        }
    }
}
