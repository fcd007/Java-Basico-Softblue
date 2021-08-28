import java.util.Date;

public class Produto {

	protected String descricao;
	protected double peso;
	protected Date dataValidade;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (!descricao.isEmpty()) {
			this.descricao = descricao;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		if (dataValidade != null) {
			this.dataValidade = dataValidade;
		}
	}

}
