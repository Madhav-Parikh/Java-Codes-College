class Constuctor {
	private String msg;

	Constuctor() {
		this.msg = "Default message";
	}

	Constuctor(String msg) {
		this.msg = msg;
	}

	Constuctor(Constuctor obj) {
		this.msg = obj.msg;
	}

	void print() {
		System.out.println(this.msg);
	}
}

public class p4prac2 {
	public static void main(String[] args) {
		Constuctor obj1 = new Constuctor();
		obj1.print();
		Constuctor obj2 = new Constuctor("Hey there!");
		obj2.print();
		Constuctor obj3 = new Constuctor(obj2);
		obj3.print();
	}
}
