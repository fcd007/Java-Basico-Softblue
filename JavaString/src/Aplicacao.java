
public class Aplicacao {
	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = "abc"; //String literal v�o para o heap -> refer�ncia vai para o pool
		
//		// == compara objetos na mem�ria
//		System.out.println(s1 == s2);
//		// as strings atribuidas v�o para o pool de strings
//		System.out.println(s2 == s3);
//		
//		// comparar o conte�dos da String
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
	}
}
