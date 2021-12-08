class Vehical{
    
    public void desc()
    {
       System.out.println("There are many vehicals available.");
    }
 }
 class Car extends Vehical{
   
    public void desc() {
       System.out.println("A car (or automobile) is a wheeled motor vehicle used for transportation.\n");
    }
}

 class Bicycle extends Vehical{
   
    public void desc() {
        System.out.println("Bicycle, also called bike, two-wheeled steerable machine that is pedaled by the rider's feet.\n");
     }
    }

     class Boat extends Vehical{
   
        public void desc() {
            System.out.println("A boat is a watercraft of a large range of types and sizes, but generally smaller than a ship");
         }
        }

public class p10prac2 {

    public static void main( String args[]) {
       Car obj = new Car();
       Bicycle objBicycle = new Bicycle();
       Boat  objBoat= new Boat();
     
       obj.desc();
       objBicycle.desc();
       objBoat.desc();
    }
 }
