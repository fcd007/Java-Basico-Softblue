
//relação é um - herança -
public class Carro extends Veiculo{
	
	private boolean quatroPortas;
	
	
	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	@Override
	public void buzinar() {
		System.out.println("Piiii Piiiii");
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Quatro portas: " + isQuatroPortas());
	}

}
