
public class Aplicacao {
	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = "abc"; //String literal vão para o heap -> referência vai para o pool
		
//		// == compara objetos na memória
//		System.out.println(s1 == s2);
//		// as strings atribuidas vão para o pool de strings
//		System.out.println(s2 == s3);
//		
//		// comparar o conteúdos da String
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
	}
}
