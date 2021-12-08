class distance{
	int ft;
	int in;
	distance(int f,int i){
		ft=f;
		in=i;
		System.out.println("Constructor");
	}
	void disp(){
		System.out.println("Feet: "+ft);
		System.out.println("Inch: "+in);
	}
	distance(distance clone){
		ft=clone.ft;
		in=clone.in;
		System.out.println("Clone Constructor");
	}
}
class p2prac2{
	public static void main(String [] args){
		distance d1=new distance(10,15);
		distance d2=new distance(d1);
		d1.disp();
		d2.disp();
	}
}