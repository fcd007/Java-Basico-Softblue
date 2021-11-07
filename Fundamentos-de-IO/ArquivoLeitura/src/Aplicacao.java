import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) throws IOException {
		//bora para versão mais baixo nível
		//Vamos trabalhar com entrada
//		try (InputStream input = new FileInputStream("entrada.txt")) {
//			//precisamos armazenar em um array de bytes a leitura
//			byte[] buffer = new byte[1024];
//			//retorna um valor inteiro com o valor de bytes lidos
//			int byteslidos = input.read(buffer);
//			//realizando a conversão de byte para String
//			String stringLida = new String(buffer, 0, byteslidos);
//			//mostrando a 
//			System.out.println(stringLida);
//			System.out.println(stringLida.length());
//		}
		
		//caso do buffer for menos que a leitura da string no arquivo texto
		//solução para esse caso criar um loop e ficar lendo até o final do arquivo
//		try (InputStream input = new FileInputStream("entrada.txt")) {
//			byte[] buffer = new byte[4];
//			int bytesLidos;
//			String leitura = "";
//			
//			//mais comum usar loop para leitura
//			while((bytesLidos = input.read(buffer)) > -1) { //quando não conseguimos mais ler do arquivo ele retorna -1
//				leitura += new String(buffer, 0, bytesLidos);
//			}
//			
//			System.out.println(leitura);
//			System.out.println(leitura.length());
//			
//		}
		
		//arquivo texto - maneira mais fácil
		
//		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
//			String string = "";
//			String line;  //ler uma linha do arquivo
//			
//			while((line = reader.readLine()) != null) {
//				string += line + "\n";
//			}
//			
//			System.out.println(string);
//		}
		
		try(Scanner scanner = new Scanner(new File("entrada.txt"))) {
			
			String linhaLida = "";
			
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				linhaLida += line + "\n";
			}
			
			System.out.println(linhaLida);
		}
		
	}
}
