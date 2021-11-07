package codedatatime;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		
//		Date date = new Date();
//		long mili = date.getTime(); //retorna o tempo em milisegundos
		Calendar cal = Calendar.getInstance(); //representa a data e hora atual do sistema
//		cal.set(Calendar.YEAR, 2021); //date e calendar os meses começam com 0 e assim por diante
//		cal.set(Calendar.MONTH, 9);
		cal.set(2021, 9, 11, 20, 30, 0);
		
		//realizando soma de campos
		cal.add(Calendar.YEAR, 0);
		cal.add(Calendar.HOUR, -1);
		cal.add(Calendar.MINUTE, -30);
		//fazendo conversão Calendar para Date
		Date data = cal.getTime();
		//passando Date para Calendar
//		cal.setTime(d);
		
		//realizar somas no Calendar
		System.out.println(data);

		DateFormat formato1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String f1 =  formato1.format(data);
		System.out.println(f1);
	}
}
