
public class Diretor extends Funcionario{

	@Override
	public double getBonificacao() {
		return this.salario * 1.35 + 500.00;
	}
	
}
