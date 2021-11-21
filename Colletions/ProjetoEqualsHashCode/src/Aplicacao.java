import java.util.HashSet;
import java.util.Set;

public class Aplicacao {

	public static void main(String[] args) {

		/*o que é um elemento duplicado?  Um elemento que possui um atributo identificador com o mesmo valor atribuido no abjeto criado */
		//vamos criar uma lista de produtos
		Produto produto1 = new Produto(1, "Ventilador", 80.50, 1);
		Produto produto2 = new Produto(2, "Televisão", 80.50, 1);
		Produto produto3 = new Produto(3, "Monitor", 420.69, 1);
		Produto produto4 = new Produto(4, "Livro", 50.75, 1);
		
		// podemos definir um atributo como identificador único
		Set<Produto> produtos = new HashSet<>(); // criando um conjunto de produtos sem ordenação de iserção elemento
//		Set<Produto> produtos = new LinkedHashSet<>(); // criando um conjunto de produtos com ordenação de iserção elemento
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		//vamos iterar os itens do conjunto
		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}
		
		for (Produto produto : produtos) {
			System.out.println("Produto ID => " + produto.getId() + " - " + produtos.contains(produto));
		}
	}
}
