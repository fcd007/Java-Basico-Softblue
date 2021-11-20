import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aplication {
	public static void main(String[] args) {
		Set<Pessoa> conjunto = new HashSet<>();
		
		Pessoa pe1 = new Pessoa(1L, "João", "joao@hotmail.com", "99999-9991", "999.999.999-99");
		Pessoa pe2 = new Pessoa(2L, "Maria", "maria@hotmail.com", "99999-9992", "999.999.999-91");
		Pessoa pe3 = new Pessoa(3L, "Lucas", "lucas@hotmail.com", "99999-9993", "999.999.999-92");
		Pessoa pe4 = new Pessoa(4L, "Joana", "joana@hotmail.com", "99999-9994", "999.999.999-93");
		Pessoa pe5 = new Pessoa(4L, "Joana", "joana@hotmail.com", "99999-9994", "999.999.999-93");

		conjunto.add(pe1);
		conjunto.add(pe2);
		conjunto.add(pe3);
		conjunto.add(pe4);
		conjunto.add(pe5);

		for (Pessoa pessoa : conjunto) {
			System.out.println(pessoa);
		}
		
		for (Iterator<Pessoa> iterator = conjunto.iterator(); iterator.hasNext();) {
			Pessoa pessoa = (Pessoa) iterator.next();
			System.out.println(pessoa);
		}
		
		Iterator<Pessoa> iterator = conjunto.iterator();
		
		while (iterator.hasNext()) {
			Pessoa pessoa = (Pessoa) iterator.next();
			System.out.println(pessoa);
		}

		// implementando a LinkedHashSet

		Set<Pessoa> conjunto2 = new LinkedHashSet<>();

		Pessoa p1 = new Pessoa(1L, "João", "joao@hotmail.com", "99999-9991", "999.999.999-99");
		Pessoa p2 = new Pessoa(2L, "Maria", "maria@hotmail.com", "99999-9992", "999.999.999-91");
		Pessoa p3 = new Pessoa(3L, "Lucas", "lucas@hotmail.com", "99999-9993", "999.999.999-92");
		Pessoa p4 = new Pessoa(4L, "Joana", "joana@hotmail.com", "99999-9994", "999.999.999-93");
		Pessoa p5 = new Pessoa(4L, "Joana", "joana@hotmail.com", "99999-9994", "999.999.999-93");

		conjunto2.add(p1);
		conjunto2.add(p2);
		conjunto2.add(p3);
		conjunto2.add(p4);
		conjunto2.add(p5);
		
		for (Pessoa pessoa : conjunto2) {
			 System.out.println(pessoa);
		}
		
		for (Iterator<Pessoa> iterator2 = conjunto2.iterator(); iterator2.hasNext();) {
			Pessoa pessoa = (Pessoa) iterator2.next();
			System.out.println(pessoa);
		}
		
		Iterator<Pessoa> iterator2 = conjunto2.iterator();
		
		while (iterator2.hasNext()) {
			Pessoa pessoa = (Pessoa) iterator2.next();
			System.out.println(pessoa);
		}
				
		// implementando a TreeSet

		Set<Pessoa> conjunto3 = new TreeSet<>();

		Pessoa pes1 = new Pessoa(1L, "João", "joao@hotmail.com", "99999-9991", "999.999.999-99");
		Pessoa pes2 = new Pessoa(2L, "Maria", "maria@hotmail.com", "99999-9992", "999.999.999-91");
		Pessoa pes3 = new Pessoa(3L, "Lucas", "lucas@hotmail.com", "99999-9993", "999.999.999-92");
		Pessoa pes4 = new Pessoa(4L, "Joana", "joana@hotmail.com", "99999-9994", "999.999.999-93");
		Pessoa pes5 = new Pessoa(4L, "Joana", "joana@hotmail.com", "99999-9994", "999.999.999-93");

		conjunto3.add(pes1);
		conjunto3.add(pes2);
		conjunto3.add(pes3);
		conjunto3.add(pes4);
		conjunto3.add(pes5);
		
		for (Pessoa pessoa : conjunto3) {
			System.out.println(pessoa);
		}
		
		for (Iterator iterator3 = conjunto3.iterator(); iterator3.hasNext();) {
			Pessoa pessoa = (Pessoa) iterator3.next();
			System.out.println(pessoa);
		}
		
		Iterator<Pessoa> iterator3 = conjunto3.iterator();
		
		while (iterator3.hasNext()) {
			Pessoa pessoa = (Pessoa) iterator3.next();
			System.out.println(pessoa);
		}

	}
}
