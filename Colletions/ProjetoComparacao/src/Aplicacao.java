import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aplicacao {
	public static void main(String[] args) {
		//ordena��o de elementos na hora da iser��o conjuntos que possuem tree no nome
		/* Bora criar uns produtos para poder trabalhar com os conjuntos*/
		Produto produto1 = new Produto(1, "Ventilador", 80.50);
		Produto produto2 = new Produto(2, "Televis�o", 80.51);
		Produto produto3 = new Produto(3, "Monitor", 420.69);
		Produto produto4 = new Produto(4, "Livro", 50.75);
		
		/* Queremos adicionar ele em uma cole��o, ordenados de forma avaliando o valor preco*/
//		Set<Produto> produtos = new TreeSet<>();
//		Set<Produto> produtos = new TreeSet<Produto>(new ComparatorProdutoId());
//		
//		produtos.add(produto1);
//		produtos.add(produto2);
//		produtos.add(produto3);
//		produtos.add(produto4);
//		
//		for (Produto produto : produtos) {
//			System.out.println(produto.toString());
//		}
		
		
		//utilizando comparator com listas
		List<Produto> produtos = new ArrayList<>();
		//bora adicionar itens na lista - lembrando que a lista j� respeita a ordem de iser��o de elementos
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		//Para poder realizar um ordena��o utilizando Collections.sort(produtos);
//		Collections.sort(produtos, new ComparatorProdutoId());
//		Collections.sort(produtos, new ComparatorProdutoId());
		produtos.sort(new ComparatorProdutoId());

		/* Realizando a utiliza��o do comparator implementado */
		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}
	}
}
