package problemas;


class Animal {
	public Animal(int numPatas) {
		System.out.println("ANIMAL: " + numPatas);
	}
	
}

class Aranha extends Animal{
	public Aranha() {
		super(8);
	}
}

	
public class Aplicacao {
	public static void main(String[] args) {
		
		Aranha a = new Aranha();
	}

}
