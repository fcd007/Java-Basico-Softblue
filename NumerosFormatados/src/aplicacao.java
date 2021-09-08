import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class aplicacao {
	public static void main(String[] args) {
		// para trabalhar numeros - class NumberFormat
		double numero = 1145.4;
		// padrão brasileiro pt-br decimais
		NumberFormat number1 = NumberFormat.getNumberInstance();
		String stringNumero = number1.format(numero);
		System.out.println(stringNumero);
		
		NumberFormat number2 = NumberFormat.getNumberInstance(new Locale("en", "US"));
		String stringNumber2 = number2.format(numero);
		System.out.println(stringNumber2);
		
		//formatando moedas pt-br
		NumberFormat number3 = NumberFormat.getCurrencyInstance();
		String stringMoeda = number3.format(numero);
		System.out.println(stringMoeda);
		//formatando moedas US
		NumberFormat number4 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		String stringMoedaUS = number4.format(numero);
		System.out.println(stringMoedaUS);
		
		//trabalhar com formatação numérica - decimal
		//criando padrão
		DecimalFormat decimalFormat1 = new DecimalFormat("00,000.000");
		decimalFormat1.setGroupingUsed(true);
		//criando decimal format simbol
		DecimalFormatSymbols decimalFS = new DecimalFormatSymbols();
		decimalFS.setDecimalSeparator('-');
		decimalFormat1.setDecimalFormatSymbols(decimalFS);
		String string1 = decimalFormat1.format(numero);
		System.out.println(string1);
	}
}
