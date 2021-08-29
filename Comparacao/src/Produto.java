
public class Produto implements Comparable<Produto> {
	private int id;
	private String descricao;
	private double valor;

	public Produto(int id, String descricao, double valor) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return id + ", " + descricao + ", " + valor;
	}

	//comparamos o item para determinar o item igual pelo atributo
	@Override
	public int compareTo(Produto o) {
		if (this.valor == o.valor) {
			return 0;
		}

		if (this.valor > o.valor) {
			return 1;
		}
		
		return -1;
	}

}
