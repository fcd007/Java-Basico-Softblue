
public class Aplicacao {

	public static void main(String[] args) {

		Veiculo veiculo1 = new Veiculo();
		veiculo1.setMarca("Ford");
		veiculo1.setModelo("Fuzion");
		veiculo1.setAno(2021);
		
		Carro carro1 = new Carro();
		carro1.setMarca("Audi");
		carro1.setModelo("Buggati Veron");
		carro1.setAno(2020);
		
		Motocicleta moto1 = new Motocicleta();
		moto1.setAno(2020);
		moto1.setMarca("Honda");
		moto1.setModelo("Bros 360");
		
		Caminhao caminhao1 = new Caminhao();
		caminhao1.setAno(2010);
		caminhao1.setMarca("Volvo");
		caminhao1.setModelo("Forge Kis");
		
		veiculo1.exibirDados();
		veiculo1.buzinar();
		
		System.out.println();

		caminhao1.exibirDados();
		caminhao1.buzinar();
		
		System.out.println();
		
		moto1.exibirDados();
		moto1.buzinar();
		moto1.empinar();
		
		System.out.println();
		
		carro1.exibirDados();
		carro1.buzinar();
	}
}
