
public class ControleBonificacao {
	
	private double totalDeBonificacaoes = 0.0;
	
	public void registra(Funcionario funcionario ) {
		System.out.println("Adicionando bonifica��o do funcionario: " + funcionario);
		this.totalDeBonificacaoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacaoes() {
		return totalDeBonificacaoes;
	}

}
