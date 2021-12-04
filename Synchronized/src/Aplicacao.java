
public class Aplicacao {
	public static void main(String[] args) throws Exception{
		// criando uma conta para trabalhar com ela
		ContaBancaria conta = new ContaBancaria();

		// vamos passar a conta para as pessoas
		Pessoa p1 = new Pessoa(conta);
		Pessoa p2 = new Pessoa(conta);

		// vamos criar as threads
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Saldo => " + conta.getSaldo());
	}
}
