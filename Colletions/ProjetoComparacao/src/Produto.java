
public class Produto {

	private int id;
	private String nome;
	private double preco;

	public Produto() {
	}

	public Produto(int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nome=" + nome + ", preco=" + preco;
	}

//	@Override
//	public int compareTo(Produto o) {
//		/*
//		 * O método retorna um inteiro como resultado da comparação se forem iguais
//		 * retorna => 0 se o objeto for maior que o objeto "o" temos que retorna um
//		 * positivo ( 1 ou outro positivo) se o objeto "O" for menor que o objeto
//		 * comparado será retornado negativo ( -1 )
//		 */
//		if (this.id == o.id) {
//			return 0;
//		}
//
//		if (this.id > o.id) {
//			return 1;
//		}
//
//		return -1;
//	}
}
