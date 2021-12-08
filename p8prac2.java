class  z1{
    int x;
    int y;
    int z;
    z1(int x , int y)
    {
        this.x = x;
        this.y = y;
    }
    z1(int x , int y , int z )
    {
        this(x, y);

        this.z = z;
    }
    void display()
    {
        System.out.println("The value of x , y and z is "+x +" "+ y +" "+ z);
    }
}

public class p8prac2 {
    public static void main(String[] args) {
        z1 z = new z1(5 , 10);
         z.display();
        z = new z1( 11 , 12 , 13);
         z.display();

    }
}
