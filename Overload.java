class Overload
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class Areas 
{
     public static void main(String args[]) 
	{
	   Overload ol = new Overload();
	   ol.area(5);
	   ol.area(11,12);
	   ol.area(2.5);
        }
}