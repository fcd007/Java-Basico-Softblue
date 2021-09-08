
public class Veiculo {
	
//	public Veiculo() {
//		System.out.println("Veiculo");
//	}
	
	public Veiculo(String marca) {
		this.marca = marca;
		System.out.println("Veiculo(String)");
	}
	
	protected String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
