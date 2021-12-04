
public class ContaBancaria {
	private double saldo = 1000;
	//cada monitor possui uma chave, igual a um banheiro que só pode ser usado por uma pessoa por vez
	//private final Object monitor = new Object(); //podemos usar o próprio objeto como lock com o this

	public synchronized void sacar(double valor) {
		//synchronized (this) {	//sincronismo correto da região crítica		
			saldo -= valor;
		//}
	}

	public synchronized void depositar(double valor) {
		//synchronized (this) { //sincronismo correto da região crítica
			saldo += valor;
		//}
	}

	public double getSaldo() {
		return saldo;
	}
}
