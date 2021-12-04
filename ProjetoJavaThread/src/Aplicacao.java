
public class Aplicacao {
	public static void main(String[] args) {
		Contador contador = new Contador();
		contador.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main => " + i);
		}

		Contador2 contador2 = new Contador2();
		Thread thread = new Thread(contador2);
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main2 => " + i);
		}
	}
}
