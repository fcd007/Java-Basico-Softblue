import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplicacao {
	public static void main(String[] args) throws IOException {

		// transferência de dados entre arquivos
//		try(FileInputStream finput = new FileInputStream("entrada.txt");
//				FileOutputStream foutput = new FileOutputStream("saida.txt")) {
//			//usando um recurso para uso do polimorfismo
//			transfer(finput, foutput);
//		}

//		try (FileInputStream finput = new FileInputStream("entrada.txt"); OutputStream cout = System.out) {
//			// usando um recurso para uso do polimorfismo
//			transfer(finput, cout);
//		}
//		
//		try(InputStream cin = System.in;
//				OutputStream fout = new FileOutputStream("saida2.txt")){
//			transfer(cin, fout);
//		}
		
		try(FileInputStream finput = new FileInputStream("entrada.txt")) {
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			transfer(finput, bout);
			
			byte[] bytes = bout.toByteArray();
			String string = new String(bytes);
			
			System.out.println(string);
		}
		
	}

	private static void transfer(InputStream input, OutputStream output) throws IOException {
		// criando um buffer de armazenamento
		byte[] buffer = new byte[1024];
		int bytesLidos;
		while ((bytesLidos = input.read(buffer)) > -1) {

			output.write(buffer, 0, bytesLidos);
		}
	}
}
