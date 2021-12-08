
import java.util.Scanner;

public class ExceptionBinarySearch{

    public static void main(String[] args) {

        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Array Length: ");
            int length = sc.nextInt();
            int[] arr = new int[length];
            System.out.println("Enter the values for array in ascending order: ");
            for(int i = 0; i < length; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the element to search: ");
            int key = sc.nextInt();
            boolean present = false;
            int first = 0;
            int last = arr.length - 1;
            int index = -1;

            while(first <= last && !present){
                int middle = (first + last) / 2;
                if(key > arr[middle]){
                    first = middle + 1;
                }
                else if(key < arr[middle]){
                    last = middle - 1;
                }
                else{
                    present = true;
                    index = middle;
                }
            }

            if(present)
            {
                System.out.println(key + " found at index " + index + ".");
            }
            else
            {
                System.out.println("Element not present in the array.");
            }
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }
    }
}
