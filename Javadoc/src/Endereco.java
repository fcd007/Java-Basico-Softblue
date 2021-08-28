/**
 * Endereço do contato
 * @author fcd007
 */
public class Endereco {
	/**
	 * Nome da rua do endereço
	 */
	private String rua;
	
	/**
	 * Numero do endereço
	 */
	private int numero;

	/**
	 * Retorna nome da rua
	 * @return Nome da Rua
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * Recebe um nome rua
	 * @param rua
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * Retorna número do endereço
	 * @return Número do endereço
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Recebe o número do endereço
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
