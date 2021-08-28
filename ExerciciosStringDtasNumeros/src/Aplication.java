import java.util.Date;

public class Aplication {

	public static void main(String[] args) {
		
		Produto produto[] = new Produto[3];
		

		produto[0].setDescricao("Feijão");
		produto[0].setPeso(2.5);
		produto[0].setDataValidade(new Date());
		
		produto[1].setDescricao("Café");
		produto[1].setPeso(1.0);
		produto[1].setDataValidade(new Date());
		
		produto[2].setDescricao("Beterraba");
		produto[2].setPeso(0.9);
		produto[2].setDataValidade(new Date());
		
		for (int i = 0; i < 3; i++) {
			 System.out.println(i + ") " + produto[i].getDescricao() + " " + produto[i].getPeso() + " " + produto[i].getDataValidade());
		}
	}

}
