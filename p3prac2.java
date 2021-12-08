class Parent {
    Parent() {
        System.out.println("Hello from the parent class.");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Hello from the child class.");
    }
}

public class p3prac2 {
    public static void main(String[] args) {
        new Child();
    }
}
