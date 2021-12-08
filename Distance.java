import java.util.*;

class distance {

	int feet;
	int inch;

	void inputDistance(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the distance in Feet: ");
		feet=sc.nextInt();
		System.out.print("Enter the distance in Inch: ");
		inch=sc.nextInt();
	}
	void displayDistance(){
		System.out.println("Feet: "+feet);
		System.out.println("Inch: "+inch);
	}
}
class p1prac2{
	public static void main(String [] args){
		distance d1=new distance();
		d1.inputDistance();
		d1.displayDistance();
	}
}