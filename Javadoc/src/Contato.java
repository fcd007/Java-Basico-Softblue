
/**
 * Classe que representa um contato
 * @author fcd007
 * @version 1.0
 *
 */
public class Contato {
	/**
	 * Nome do contato.
	 */
	private String nome;
	
	/**
	 * Email do contato
	 */
	private String email;
	
	/**
	 * Endereço do contato
	 */
	private Endereco endereco = new Endereco();

	/**
	 * @param nome Nome do contato.
	 * @param email Email do contato
	 */
	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	/**
	 * Define o endereço do contato.
	 * @param rua Rua do contato
	 * @param numero Numero do contato
	 */
	public void definirEndereco(String rua, int numero) {
		endereco.setRua(rua);
		endereco.setNumero(numero);
	}

	/**
	 * Retorna o nome
	 * @return Nome do Contato.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Retorna o e-mail
	 * @return Email do contato
	 */
	public String getEmail() {
		return email;
	}
}
