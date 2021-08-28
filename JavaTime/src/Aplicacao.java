import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aplicacao {

	public static void main(String[] args) {
		
		String dataNascimento = "07/11/1989 22:00";
		
		//precisamos fazer o calculo da data
		LocalDateTime ldt1 = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime ldt2 = LocalDateTime.now();
		
		//verificar a diferenca de datas
		Duration d = Duration.between(ldt1, ldt2); //data final e data atual
		System.out.println("Horas de vida " + d.toHours());
		System.out.println("Dias de vida " + d.toDays());
		
		//para trabalhar com meses o duration não é o mais adequadro
		//vamos receber data então LocalDate
		
		Period p = Period.between(ldt1.toLocalDate(), ldt2.toLocalDate());
		System.out.println("Meses de vida " + p.toTotalMonths());
		
		//trabalhando com semanas 
		System.out.println("Semanas " + ChronoUnit.WEEKS.between(ldt1, ldt2));
		//ver o tempo em anos
		System.out.println("Anos: " + ChronoUnit.YEARS.between(ldt1, ldt2));
		//sempre que quiser saber algo sobre intervalos sobre datas com between - retorno long
	}
}
