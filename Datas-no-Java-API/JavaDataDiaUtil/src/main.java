import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class main {

	public static void main(String[] args) {
		
		//Inicia a classe
		Feriados feriados = new Feriados();
		
		// 12/10/2021
		Calendar calendarTestar = GregorianCalendar.getInstance();
		
//		//dia do mês
//		calendarTestar.set(Calendar.DAY_OF_MONTH, 02);
//		calendarTestar.set(Calendar.MONTH, Calendar.NOVEMBER);
//		calendarTestar.set(Calendar.YEAR, 2021);
//		
//		//Testar se a data é feriado 
//		System.out.println(feriados.isFeriado(calendarTestar.getTime())); // true
//		

		//dia do mês
		calendarTestar.set(Calendar.getInstance().YEAR ,Calendar.DECEMBER, 25);
		
		//Testar se é feriado 
//		System.out.println(feriados.isFeriado(calendarTestar.getTime()));
//		System.out.println(calendarTestar.getTime());

	}

}
