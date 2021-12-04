
public class Aplicacao {
	public static void main(String[] args) throws Exception {

		//Condi��o de corrida - race condition - problema de concorr�ncia
		//regi�o cr�tica
		MyThread[] threads = new MyThread[1000];

		Contador contador = new Contador();

		// bora criar as threads
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread(contador);
		}

		// aqui inicializamos as threads
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}

		System.out.println("Valor => " + contador.getValor());
	}
}
