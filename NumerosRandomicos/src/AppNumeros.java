import java.util.Random;

public class AppNumeros {

	public static void main(String[] args) {
		
		
		//forma simples de realizar a criação de números randômicos (bobinho)
//		for(int i = 0; i < 10; i++) {
//			double numero = Math.random();
//			System.out.println((i + 1) + " => " + numero);
//		}
		
		//classe Random
		Random random = new Random(10);
		
		for (int i = 0; i < 10; i++) {
			
			int d = random.nextInt(gerarInt(1, 50));
			System.out.println((i + 1) + " => " + d);
		}
	}
	
	static int gerarInt(int inicio, int fim) {
		int intervalo = fim - inicio;
		int n = (int) (Math.random() * intervalo) + inicio;
		return n;
	}

}
