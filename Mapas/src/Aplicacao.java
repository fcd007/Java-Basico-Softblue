import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Aplicacao {
	public static void main(String[] args) {
		//criando alguns produtos
		Produto p1 = new Produto(1, "Produto 1");
		Produto p2 = new Produto(2, "Produto 20");
		Produto p3 = new Produto(3, "Produto 3");
		
		//Map<Integer, Produto> map = new HashMap<>();  //o HashMap não garante a ordem dos elementos
		//Map<Integer, Produto> map = new LinkedHashMap<>(); // garante a ordem de inserção dos elementos
		Map<Integer, Produto> map = new TreeMap<>(); // organiza os elementos de forma crescente - automático
		//add elementos a coleção
		map.put(1, p1);
		map.put(20, p2);
		map.put(3, p3);
		
		//vantagem de localização (dicionário)
		//quero o produto 2
//		Produto p = map.get(1);
//		System.out.println(p);
		
//		Set<Integer> keys = map.keySet(); //para poder legar as chaves do map
//		
//		for (Integer key : keys) {
//			System.out.println(key);
//		}
//		
//		Collection<Produto> values = map.values(); //para legar os valores do map
//		
//		for (Produto produto : values) {
//			System.out.println(produto);
//		}
		
		//pegar par chave valor
		Set<Map.Entry<Integer, Produto>> entries =  map.entrySet();
		
		for (Map.Entry<Integer, Produto> entry : entries) {
			System.out.println(entry.getKey() + " => "+ entry.getValue());
		}
	}
}
