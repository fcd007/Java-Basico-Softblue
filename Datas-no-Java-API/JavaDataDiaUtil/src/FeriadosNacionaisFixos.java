import java.util.Calendar;
import java.util.List;

public class FeriadosNacionaisFixos {
	
	public Calendar pascoa = CalendarWrapperDate.getInstance();
	public Calendar carnaval = CalendarWrapperDate.getInstance();
	public Calendar corpusChristi = CalendarWrapperDate.getInstance();
	public Calendar sextaFeiraSanta = CalendarWrapperDate.getInstance();
	public Calendar diaDoTrabalhador =  CalendarWrapperDate.getInstance();
	public Calendar natal =  CalendarWrapperDate.getInstance();
	public Calendar seteDeSetembro =  CalendarWrapperDate.getInstance();
	public Calendar diasDasCriancas =  CalendarWrapperDate.getInstance();
	public Calendar finados =  CalendarWrapperDate.getInstance();
	public Calendar proclamacaoDaRepublica =  CalendarWrapperDate.getInstance();
	public Calendar tiradentes = CalendarWrapperDate.getInstance();
	public Calendar primeiroDiaDoAno = CalendarWrapperDate.getInstance();
	
	private List<Calendar> lstCalendar;
	private int ano;
	
	/**
	 * Apenas seta os feriados que dias fixos
	 * todo ano ex: natal todo dia 25/12
	 */
	protected void calcularDatasFixas() {
		
		// 01/05
		this.diaDoTrabalhador.set(Calendar.YEAR, ano);
		this.diaDoTrabalhador.set(Calendar.MONTH, Calendar.MAY);
		this.diaDoTrabalhador.set(Calendar.DAY_OF_MONTH, 1);
		
		// 25/12
		this.natal.set(Calendar.YEAR, ano);
		this.natal.set(Calendar.MONTH, Calendar.DECEMBER);
		this.natal.set(Calendar.DAY_OF_MONTH, 25);
		
		// 07/09
		this.seteDeSetembro.set(Calendar.YEAR, ano);
		this.seteDeSetembro.set(Calendar.MONTH, Calendar.SEPTEMBER);
		this.seteDeSetembro.set(Calendar.DAY_OF_MONTH, 7);
		
		// 12/10
		this.diasDasCriancas.set(Calendar.YEAR, ano);
		this.diasDasCriancas.set(Calendar.MONTH, Calendar.OCTOBER);
		this.diasDasCriancas.set(Calendar.DAY_OF_MONTH, 12);

		// 02/11
		this.finados.set(Calendar.YEAR, ano);
		this.finados.set(Calendar.MONTH, Calendar.NOVEMBER);
		this.finados.set(Calendar.DAY_OF_MONTH, 2);
		
		// 15/11
		this.proclamacaoDaRepublica.set(Calendar.YEAR, ano);
		this.proclamacaoDaRepublica.set(Calendar.MONTH, Calendar.NOVEMBER);
		this.proclamacaoDaRepublica.set(Calendar.DAY_OF_MONTH, 15);

		// 21/04
		this.tiradentes.set(Calendar.YEAR, ano);
		this.tiradentes.set(Calendar.MONTH, Calendar.APRIL);
		this.tiradentes.set(Calendar.DAY_OF_MONTH, 21);
		
		// 01/01
		this.primeiroDiaDoAno.set(Calendar.YEAR, ano);
		this.primeiroDiaDoAno.set(Calendar.MONTH, Calendar.JANUARY);
		this.primeiroDiaDoAno.set(Calendar.DAY_OF_MONTH, 01);
		
	}

}
