package Application;
import java.util.Calendar;
import java.util.Date;

public class Aplicacao {
	public static void main(String[] args) {
		// Date e Calendar
		Date date = new Date(); // cria uma data atual, o retorno numero de milisegundos em long
		long mili = date.getTime();
		//System.out.println(mili); // retorno a partir de 1970 às 00:00:00

		// fazer aritmética com datas
		Calendar calendar = Calendar.getInstance(); // representado a data a hora atual do sistema
		calendar.set(Calendar.YEAR, 2020);
		calendar.set(Calendar.MONTH, 7);
		calendar.set(Calendar.DAY_OF_MONTH, 3);

		// definir uma data e hora e minutos
		calendar.set(2020, 1, 5, 13, 30, 0);
		calendar.add(Calendar.YEAR, 1);
		//System.out.println(calendar);
		//representar data 
		Date dataConverte = calendar.getTime();
		//calendar.setTime(date);
		System.out.println(date);
		
		//para poder formatação de datas
		
	}
}
