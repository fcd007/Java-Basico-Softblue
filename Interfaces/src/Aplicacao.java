
public class Aplicacao {
	public static void main(String[] args) {

		Ferrari veneno1 = new Ferrari();
		AnelBrilhante anel1 = new AnelBrilhante();
		Vendedor vendedor1 = new Vendedor();
		
		vendedor1.mostrarPreco(veneno1);
		vendedor1.mostrarPreco(anel1);
	}
}
