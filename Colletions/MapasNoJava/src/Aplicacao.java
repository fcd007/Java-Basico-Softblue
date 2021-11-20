import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Aplicacao {
	public static void main(String[] args) {
		
		//as chaves não ficam organizadas
		Map<Long, Produto> map = new HashMap<>();
		
		//vamos criar alguns produtos para serem adicionados 
		//criando uma lista de produtos para adicionar os produtos
//		List<Produto> listaProduto = new ArrayList<>();
		//criando os produtos
		Produto pdt1 = new Produto(1L, "Notebook Acer");
		Produto pdt2 = new Produto(2L, "Notebook Dell");
		Produto pdt3 = new Produto(3L, "Notebook Lenovo");
		Produto pdt4 = new Produto(4L, "Notebook Asus");
		Produto pdt5 = new Produto(5L, "MacBook Air");
//		
//		listaProduto.add(pdt1);
//		listaProduto.add(pdt2);
//		listaProduto.add(pdt3);
//		listaProduto.add(pdt4);
//		listaProduto.add(pdt5);
		
//		Iterator<Produto> iterator = listaProduto.iterator();
//		while (iterator.hasNext()) {
//			Produto produto = (Produto) iterator.next();
//			System.out.println(produto);
//		}
		
		//forma de utilizar iterator com uso do for avançado
//		for (Iterator<Produto> iterator2 = listaProduto.iterator(); iterator2.hasNext();) {
//			Produto produto = (Produto) iterator2.next();
//			System.out.println(produto);
//		}
		
		//para adicionar elementos no Map
		map.put(1L, pdt1);
		map.put(2L, pdt2);
		map.put(2L, pdt3);
		map.put(4L, pdt4);
		map.put(5L, pdt5);
		
		Produto p = map.get(5L);
		System.out.println(p);
		
	//como realizar a iteração pelos elementos?
	
	}
}
