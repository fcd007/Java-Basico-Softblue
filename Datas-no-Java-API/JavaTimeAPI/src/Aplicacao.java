import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aplicacao {
	public static void main(String[] args) {
		
		String dataNascimento = "07/11/1989 23:00";
		
		//realizar um c�lculo do tempo - LocalDateTime
		LocalDateTime dataNascido = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime dataAtual = LocalDateTime.now();
		
		//trabalhar com periodos
		//trabalhar horas e dias - duration
		Duration duracao1 = Duration.between(dataNascido, dataAtual);
		System.out.println("Horas de vida : " + duracao1.toHours());
		System.out.println("Dias de vida : " + duracao1.toDays());
		
		//para trabalhar com meses, duration n�o � conveniente
		//ele ir� trabalhar com o LocalDate, ele leva em considera��o data e n�o o tempo.
		//temos que transformar o LocalDateTime em LocalDate
//		LocalDate nascimento = dataNascido.toLocalDate();
//		LocalDate atual = dataNascido.toLocalDate();

		Period periodo = Period.between(dataNascido.toLocalDate(), dataAtual.toLocalDate());
		System.out.println("Meses de vida : " + periodo.toTotalMonths());
	
		//no de trabalhar com semanas o Period n�o consegue trabalhar
		//Trabalhar o resultado em semanas
		long semanas = ChronoUnit.WEEKS.between(dataNascido, dataAtual);
		long anos = ChronoUnit.YEARS.between(dataNascido, dataAtual);
		
		System.out.println("Diferen�as em Semanas : " + semanas);
		System.out.println("Diferen�a em anos : " + anos);
	}
}
