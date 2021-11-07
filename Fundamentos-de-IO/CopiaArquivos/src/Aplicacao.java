import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Aplicacao {
	public static void main(String[] args) throws IOException{
		
		//o programa realiza a leitura e escrita para um arquivo cópia
		String inputFile = "entrada.txt";
		String outputFile = "saida.txt";
				
		try(InputStream in = new FileInputStream(inputFile);  FileOutputStream out = new FileOutputStream(outputFile)) {
			
			byte[] buffer = new byte[1024];
			
			int bytesLidos;
			
			while((bytesLidos = in.read(buffer)) > -1) {
				out.write(buffer, 0, bytesLidos);
			}
		}
	}
}
