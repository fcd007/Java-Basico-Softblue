
public class Contador {
	
	private int valor;

	//definindo que a thread irá exceturar esse trecho por vez
	public synchronized void incrementar() {
		valor++;
	}

	public int getValor() {
		return valor;
	}
}
