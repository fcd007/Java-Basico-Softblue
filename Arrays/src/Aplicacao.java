
public class Aplicacao {

	public static void main(String[] args) {
		int[] array; // definindo um array
		array = new int[5]; // 5 elementos inteiros

		array[0] = 7; // ao criar o array a inicialização será 0
		array[1] = 8;
//		
//		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}

//		for (int i : array) {
//			System.out.println(i);
//		}

		// ao inicializar um objeto sem atribuir ele será null
//		String[] str = new String[7];
//		str[0] = "Java";
//		str[1] = "C++";
//		
//		for (String string : str) {
//			System.out.println(string);
//		}
		
		Object[] obj = new Object[7];
		obj[0] = "Array";
		obj[1] = new int[3];
		obj[2] = 10;
		obj[3] = new Object();
		
		String str1 = (String) obj[0];
		
	}

}
