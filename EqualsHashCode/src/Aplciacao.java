import java.util.HashSet;
import java.util.Set;

public class Aplciacao {
	public static void main(String[] args) {

		Produto p1 = new Produto(1, "Biscoito 1");
		Produto p2 = new Produto(2, "Biscoito 2");
		Produto p3 = new Produto(3, "Biscoito 3");
		Produto p4 = new Produto(4, "Biscoito 4");
		Produto p5 = new Produto(5, "Biscoito 5");
//		Produto p3 = p2; //produtos objetos que são iguais - referente ao mesmo endereço são iguais.

		Set<Produto> produtos = new HashSet<>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);

		for (Produto produto : produtos) {
			System.out.println("=> " + produto);
		}

		System.out.println("p1 => " + produtos.contains(p1)); //verifica se possui o produto
		System.out.println("p2 => " + produtos.contains(p2));
		System.out.println("p3 => " + produtos.contains(p3));
		System.out.println("p4 => " + produtos.contains(p4));
		System.out.println("p5 => " + produtos.contains(p5));
	}
}
