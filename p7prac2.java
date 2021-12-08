public class p7prac2 {
    public int x;
    
    p7prac2() {
        x = 10;
    }
    int passByValue(int x) {
        System.out.println("x = " + x);
        return (x + 1);
    }
    p7prac2 passByReference(p7prac2 obj) {
        obj.x += 1;
        return obj;
    }
    public static void main(String[] args) {
        p7prac2 obj = new p7prac2();

        System.out.println("Pass by value:");
        System.out.println("x = " + obj.passByValue(obj.x));  

        System.out.println("Pass by reference:");
        System.out.println("x = " + obj.passByReference(obj).x);
    }
}
