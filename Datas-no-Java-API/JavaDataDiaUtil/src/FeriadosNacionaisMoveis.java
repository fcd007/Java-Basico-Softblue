import java.util.Calendar;
import java.util.List;

public class FeriadosNacionaisMoveis {
	
	public Calendar pascoa = CalendarWrapperDate.getInstance();
	public Calendar carnaval = CalendarWrapperDate.getInstance();
	public Calendar corpusChristi = CalendarWrapperDate.getInstance();
	public Calendar sextaFeiraSanta = CalendarWrapperDate.getInstance();
	
	private List<Calendar> lstCalendar;
	private int ano;

	public Calendar getPascoa() {
		return pascoa;
	}

	public Calendar getCarnaval() {
		return carnaval;
	}

	public Calendar getCorpusChristi() {
		return corpusChristi;
	}

	public Calendar getSextaFeiraSanta() {
		return sextaFeiraSanta;
	}

	/**
	 * Calcula as datas religiosas
	 */
	public void calcularDatasReligiosasDinamicas() {
		
		//Calculo da Pascoa
		int a = ano % 19;
		int b = ano / 100;
		int c = ano % 100;
		int d = b / 4;
		int e = b % 4;
		int f = (b + 8) / 25;
		int g = (b - f + 1) / 3;
		int h = (19 * a + b - d - g + 15) % 30;
		int i = c / 4;
		int k = c % 4;
		int l = (32 + 2 * e + 2 * i - h - k) % 7;
		int m = (a + 11 * h + 22 * l) / 451;
		int mes = (h + l - 7 * m + 114) / 31;
		int dia = ((h + l - 7 * m + 114) % 31) + 1;
		this.pascoa.set(Calendar.YEAR, ano);
		this.pascoa.set(Calendar.MONTH, mes-1);
		this.pascoa.set(Calendar.DAY_OF_MONTH, dia);
		
		//Carnaval 47 dias antes da pascoa
		this.carnaval.setTimeInMillis(pascoa.getTimeInMillis());
		this.carnaval.add(Calendar.DAY_OF_MONTH, -47);
		
		//CorpusChristi 60 dias apos a pascoa
		this.corpusChristi.setTimeInMillis(pascoa.getTimeInMillis());
		this.corpusChristi.add(Calendar.DAY_OF_MONTH, 60);
		
		//Sexta Feira santa 2 dias antes da pascoa
		this.sextaFeiraSanta.setTimeInMillis(pascoa.getTimeInMillis());
		this.sextaFeiraSanta.add(Calendar.DAY_OF_MONTH, -2);
	}
}
