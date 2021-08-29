import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aplicacao {
	public static void main(String[] args) {

		Produto p1 = new Produto(1, "Feijão", 6.47);
		Produto p2 = new Produto(2, "Pão", 4.59);
		Produto p3 = new Produto(3, "Arroz", 6.47);
		Produto p4 = new Produto(4, "Macarão", 3.54);
		Produto p5 = new Produto(5, "Leite", 2.50);
		Produto p6 = new Produto(6, "Carne", 35.70);

		// coleções ordenadas como escolher?
		
		// Set<Produto> produtos = new TreeSet<>(); 
		// Set<Produto> produtos = new TreeSet<Produto>(new DescricaoComparator());  //conjunto ordenado

		// trabalhar com listas
		List<Produto> produtos = new ArrayList<Produto>(); // a lista permite elementos duplicados
		// add produtos
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		produtos.add(p6);

		// para ordenar a lista podemos chamar o Colletions
		// Collections.sort(produtos);
		Collections.sort(produtos, new DescricaoComparator());

		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
