import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aplicacao {

	public static void main(String[] args) {
		//calendar e Date = criadas desde o início do Java
		//Date date = new Date();
		//conta o tempo 1970 meia noite
		//long mili = date.getTime();
		//System.out.println(mili);
		
		//trabalhando com datas - manipulando Datas
		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR, 2021);
//		cal.set(Calendar.MONTH, 7);
		cal.set(2020, 1, 5, 13, 30, 0);
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MINUTE, -30);
		Date date = cal.getTime();
		
		//call.setTime(date);
		System.out.println(date);
		
		//formatacao datas
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.SHORT);
		String f1 = df5.format(date);
		System.out.println(f1);
		
	}

}
