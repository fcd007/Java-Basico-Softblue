/**
 * Endere�o do contato
 * @author fcd007
 */
public class Endereco {
	/**
	 * Nome da rua do endere�o
	 */
	private String rua;
	
	/**
	 * Numero do endere�o
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
	 * Retorna n�mero do endere�o
	 * @return N�mero do endere�o
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Recebe o n�mero do endere�o
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
