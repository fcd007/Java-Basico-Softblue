
public class Application {

	public static void main(String[] args) {
		
		//cria��o de strings 
		String str1 = new String("ABC");
		String str2 = "abc";
		String str3 = "ABC";
		
		//System.out.println(str3 == str2); // comparando as refer�ncias dos objetos
		//System.out.println(str1.equals(str2)); //comparando os conte�dos dos objetos
		
		//atribuindo valores na cria��o da String
		//System.out.println("valor da String str1: "+ str1);
		//System.out.println("valor da String str2: " + str2);
		
		String str1Up = str2.toUpperCase();
		String str1Low = str1Up.toLowerCase();
		System.out.println(str1Up + " \n" + str1Low);
		
		//cocatenando Strings
		str3 = str1 + str2 + str3;
		System.out.println(str3);
	}
}
