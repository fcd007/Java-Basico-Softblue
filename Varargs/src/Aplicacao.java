
public class Aplicacao {

	public static void main(String[] args) {
		
//		imprimir("a");
//		imprimir("a", "b");
		imprimir("a", "b", "c");
//		imprimir("a");

	}

//	private static void imprimir(String s1) {
//		System.out.println(s1);
//	}
//
//	private static void imprimir(String s1, String s2) {
//		System.out.println(s1);
//		System.out.println(s2);
//	}
//}

	public static void imprimir(String... textos) {
		for (String string : textos) {
			System.out.println(string);
		}
	}
}
