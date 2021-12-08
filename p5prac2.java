class Q5 {

    private int privateValue;

    public int publicValue;

    final private int finalValue = 40;

    Q5(int privateValue)
     {

        this.privateValue = privateValue;
       // Not Possible because the variable is final
    }

    public void changeVariable(int value) {
        value += 10;
    }

    public void changeObject(Q5 object) {
        object.publicValue += 10;
    }

    public void print() 
    {
        System.out.println("Private Value = " + privateValue);

        System.out.println("Public Value = " + publicValue);

        System.out.println("Final Value = " + finalValue);
    }
}

public class p5prac2 {
    public static void main(String[] args) {
        Q5 obj = new Q5(10);
        // Not possible because the variable is private
        obj.publicValue = 20; 
        obj.print();

        int value = 70;
        obj.changeVariable(value); 
        System.out.println(value); 

        obj.changeObject(obj); 
        System.out.println(obj.publicValue); 
    }
}
