import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

	private static final int MAX = 10;

	private Queue<Integer> fila = new LinkedList<>();

	public synchronized void produzir(int numero) {
		while(fila.size() == MAX) {
			try {
				wait(); //só pode ser chamado em um objeto sincronizado
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		fila.offer(numero);
		
		notifyAll();
		
		imprimir();
	}

	public int comsumir() {
		synchronized (this) {
			while (fila.size() == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			int numero = fila.poll();
			
			notifyAll();
			
			imprimir();
			return numero;
		}
	}

	private void imprimir() {
		System.out.print("=> ");

		for (Integer numero : fila) {
			System.out.print(numero + " ");
		}

		System.out.println();
	}

}
