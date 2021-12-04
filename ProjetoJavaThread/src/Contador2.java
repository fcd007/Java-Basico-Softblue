
public class Contador2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("contador 2 => " + i);
		}
	}
	
}
