import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
	public static void main(String[] args) {
//		String dataNascimento = "07/11/1989 23:00:00";
		//representar uma data e uma hora
//		LocalDateTime ltd = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
//		System.out.println(ltd);
		//pegar a data atual
//		LocalDateTime atual = LocalDateTime.now();
//		System.out.println(atual);
		
		//duration calcula da duração de tempo
//		Duration duracao = Duration.between(ltd, atual); //retorno da diferença entre datas
//		System.out.println("Horas: " + duracao.toHours());
//		System.out.println("Dias: " + duracao.toDays());
//		System.out.println("Minutos: " + duracao.toMinutes());
//		System.out.println("Segundos: " + duracao.getSeconds());
		//para trabalhar com algo maior que dias temos o Period
		//precisamos trabalhar apenas com a parte de datas no periodo
//		Period periodo = Period.between(ltd.toLocalDate(), atual.toLocalDate());
//		System.out.println("Anos " + periodo.getYears());
//		System.out.println("Meses " + periodo.getMonths());
//		System.out.println("Dias " + periodo.getDays());
//		System.out.println("Total de meses " + periodo.toTotalMonths());
		
		//para comparar semanas temos que usar outra estratégia - enum
//		System.out.println("Semanas " + ChronoUnit.WEEKS.between(ltd, atual));
//		System.out.println("Anos " + ChronoUnit.YEARS.between(ltd, atual));
		
		//para representar campos mes/ano
//		YearMonth ym = YearMonth.of(2028, 10);
//		System.out.println("Ano/Mês : " + ym);
		
//		DayOfWeek dw = DayOfWeek.S

		//operações em tempo
		//data atual
//		LocalDate ld = LocalDate.now();
//		System.out.println(ld);
//		ld = ld.plusMonths(1);
//		LocalDate ldAtualizado = ld.plusMonths(1); //ao realizar um operação ou alteração o retorno será um novo objeto LocalDate
//		System.out.println(ld.plusMonths(1)); // não altera o objeto - imutável em operações no próprio objeto, apenas retorna
//		System.out.println(ld); 
//		System.out.println(ld);
//		ld = ld.minusWeeks(2).plusDays(2);
//		System.out.println(ld);
		
	}
}
