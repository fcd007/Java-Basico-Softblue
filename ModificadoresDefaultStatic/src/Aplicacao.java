
public class Aplicacao {

	public static void main(String[] args) {

		Ferrari veneno = new Ferrari();
		Porsche carro1 = new Porsche();

		veneno.derrapar();
		int velocidadeMaxima = Automovel.getVelocidadeMaxima();

		System.out.println("\nVelocidade m�xima autom�vel: " + velocidadeMaxima + "KM\n");

		carro1.derrapar();
	}

}
