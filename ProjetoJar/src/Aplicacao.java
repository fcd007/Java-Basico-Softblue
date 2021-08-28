import br.dev.StringUtils;

public class Aplicacao {
	public static void main(String[] args) {
		
		boolean resultado = StringUtils.isEmpty("avc");
		System.out.println("A string está vazia => " + resultado);
	}
}