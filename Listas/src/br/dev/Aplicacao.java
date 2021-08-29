package br.dev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aplicacao {
	public static void main(String[] args) {

		List lista = new ArrayList(); // armazena na forma de array a lista, lista recebe Object por padrão

		List<String> listaString = new ArrayList<String>(); // criando uma lista do tipo String usando generics
		List<String> listaStr = new ArrayList<>(); // o tipo do parâmetro é identificado
		
		listaString.add("ABC");
		listaString.add("def");
		listaString.add(0, "abc"); //adiciono o elemento no indice passado, sem apagar o valor anterior
//		listaString.set(0, "abc"); //sustitui o que temos no indice 0 com o valor setado
//		System.out.println(listaString);
		
//		for (int i = 0; i < listaString.size(); i++) {
//			System.out.println(listaString.get(i));
//		}
		
		//
		Iterator<String> iterator = listaString.iterator();
		while(iterator.hasNext()) {
		}
	}
}
