package Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aplicacao {
	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa(1L, "Lucas", "Santos", "fcd01@hotmail.com");
		Pessoa p2 = new Pessoa(2L, "Maria", "Moura", "fcd02@hotmail.com");
		Pessoa p3 = new Pessoa(3L, "Fernanda", "Lima", "fcd03@hotmail.com");
		Pessoa p4 = new Pessoa(4L, "Paulo", "Tarta", "fcd04@hotmail.com");
		
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
		listaPessoas.add(p4);
		
		/*
		 * Como iterar na lista de objetos
		 */
		
//		primeira forma de percorrer
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}
		System.out.println("\n----------------------------------------------------------\n");
		//segunda forma de percorrer o arrayList
		for (int i = 0; i < listaPessoas.size(); i++) {
			System.out.println(listaPessoas.get(i));
		}
		
		System.out.println("\n----------------------------------------------------------\n");

		for (Iterator<Pessoa> iterator = listaPessoas.iterator(); iterator.hasNext();) {
			Pessoa pessoa = (Pessoa) iterator.next();
			System.out.println(pessoa);
		}
		System.out.println("\n----------------------------------------------------------\n");

		Iterator<Pessoa> iterator = listaPessoas.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
