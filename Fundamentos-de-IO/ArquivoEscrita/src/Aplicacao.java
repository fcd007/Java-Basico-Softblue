import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Aplicacao {
	public static void main(String[] args) throws IOException{
		
		String string = "Texto para ser gravado no arquivo";
		//opção mais difícil
//		try(OutputStream output = new FileOutputStream("saida.txt")) {
//			
//			
//			byte[] buffer = string.getBytes();
//			
//			output.write(buffer);
//		}
		
		//maneira mais simples com string
//		try(BufferedWriter write = new BufferedWriter(new FileWriter("saida.txt"))) {
//			write.write(string);
//		}
		
		//muito versatil
		try(PrintWriter pw = new PrintWriter(new FileWriter("saida2.txt"))) {
			pw.print(string);
		}
	}
}
