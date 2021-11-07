package Application;

public class Bibliotecario {

	private Long id;
	private String acesso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAcesso() {
		return acesso;
	}

	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}

	@Override
	public String toString() {
		return "Bibliotecario [id=" + id + ", acesso=" + acesso + "]";
	}

}
