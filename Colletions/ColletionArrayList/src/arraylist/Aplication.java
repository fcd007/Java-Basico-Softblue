package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Aplication {

	public static void main(String[] args) {
		nullValueDemo();
		duplicateValueDemo();

	}

	private static void nullValueDemo() {
		List<String> list = new ArrayList<>();

		list.add(null);
		
		list.add(null);

		System.out.println(list.toString());
	}

	private static void duplicateValueDemo() {
		List<String> list = new ArrayList<>();

		list.add("Duplicado");

		list.add("Duplicado");

		System.out.println(list.toString());
	}
}
