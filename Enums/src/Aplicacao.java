
public class Aplicacao {

	private enum Sexo {
		MASCULINO, FEMININO;
	}
	
	public static void main(String[] args) {
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		
		int num = DiaDaSemana.QUARTA.getNum();
		System.out.println("Quarta => " + num);///
		
		//converter uma representação String para Enum
		String s = "TERCA";
		DiaDaSemana dia =  DiaDaSemana.valueOf(s);
		
		//CRIA UMA VARIÁVEL
		Sexo mulher = Sexo.FEMININO;
		Sexo homem = Sexo.MASCULINO;
	}
}
