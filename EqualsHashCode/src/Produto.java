import java.util.Objects;

public class Produto {
	private int id;
	private String descricao;

	public Produto(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
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

	@Override
	public String toString() {
		return id + ", " + descricao;
	}

//	@Override
//	public boolean equals(Object produto) {
//		if (produto == null) {
//			return false;
//		}
//
//		if (!(produto instanceof Produto)) {
//			return false;
//		}
//
//		Produto other = (Produto) produto;
//
//		if (this.id == other.id) {
//			return true;
//		}
//
//		return false;
//	}

//	@Override //implementado de forma errada
//	public int hashCode() {
//		return (int) (Math.random() * 10);
//	}
//	
	@Override
	public int hashCode() {
		 return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Produto))
			return false;
		Produto other = (Produto) obj;
		return id == other.id;
	};

}
