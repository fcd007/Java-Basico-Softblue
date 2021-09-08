package problemas;

class Class1 {
	public void m() {
		System.out.println(1);
	}
}

class Class2 extends Class1 {
	public void m() {
		super.m();
		System.out.println(2);
	}
}

public class Aplication2 {
	public static void main(String[] args) {
		Class2 c = new Class2();
		c.m();
	}
}
