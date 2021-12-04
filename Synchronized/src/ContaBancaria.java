
public class ContaBancaria {
	private double saldo = 1000;
	//cada monitor possui uma chave, igual a um banheiro que s� pode ser usado por uma pessoa por vez
	//private final Object monitor = new Object(); //podemos usar o pr�prio objeto como lock com o this

	public synchronized void sacar(double valor) {
		//synchronized (this) {	//sincronismo correto da regi�o cr�tica		
			saldo -= valor;
		//}
	}

	public synchronized void depositar(double valor) {
		//synchronized (this) { //sincronismo correto da regi�o cr�tica
			saldo += valor;
		//}
	}

	public double getSaldo() {
		return saldo;
	}
}
