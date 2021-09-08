
public class Aplicacao {

	public static void main(String[] args) {

		Ferrari veneno = new Ferrari();
		Porsche carro1 = new Porsche();

		veneno.derrapar();
		int velocidadeMaxima = Automovel.getVelocidadeMaxima();

		System.out.println("\nVelocidade máxima automável: " + velocidadeMaxima + "KM\n");

		carro1.derrapar();
	}

}
