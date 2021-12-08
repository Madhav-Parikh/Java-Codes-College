class Car{  
  void run()
  {
      System.out.println("There are many cars to choose from.");
    }  
}  
class Brezza extends Car{  
  void run(){
      System.out.println("Maruti Suzuki Vitara Brezza VXi is the petrol variant in the Vitara Brezza lineup.");
    }  
}

public class p11prac2 {
  public static void main(String args[]) {  
    Car c = new Brezza();  
    c.run();  
  }  
}  
