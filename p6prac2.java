public class p6prac2 {

   public static void Varargs(String... str) {

      System.out.println("Number of arguments are: " + str.length);

      System.out.println("The argument values are: ");

      for (String s : str)
         System.out.println(s);
   }
   public static void main(String args[]) {
      Varargs("Manchester United", "PSG", "Chelsea");
      Varargs();
      Varargs("Hello");
   }
}