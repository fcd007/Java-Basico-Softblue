import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {
	public static void main(String[] args) {
		//caracteristica de não permitir elementos duplicados
//		Set<String> conjunto = new HashSet<>();
//		Set<String> conjunto = new LinkedHashSet<>(); //garante a ordem de inserção
		Set<String> conjunto = new TreeSet<>(); //ordena os elementos do conjunto - usando o algoritmo de Tree
		
		conjunto.add("a");
		conjunto.add("b");
		conjunto.add("c");
		conjunto.add("d");
		conjunto.add("e");
		conjunto.add("f");
		conjunto.add("g");
		
		for (String string : conjunto) {
			System.out.println(string);
		}
	}
}
