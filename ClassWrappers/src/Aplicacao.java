
public class Aplicacao {

	public static void main(String[] args) {
		//fazendo o embrulho do valor primitivo para obj
		Integer i = Integer.valueOf(20);
		imprimir(i);
		
		Double d = Double.valueOf(25.01);
		imprimir(d);
		
		//extraindo o valor do objeto
		int valorI = i.intValue();
		double d2 = d.doubleValue();
		
		//convertendo 
		Integer i3 = Integer.valueOf("30");
		Double d3 = Double.valueOf("61.42");
		
		//parsear os valores para tipos primitivos 
		int i4 = Integer.parseInt("4");
		double d4 = Double.parseDouble("3.6");
		
		String bin = "0111";
		int i5 = Integer.parseInt(bin, 2);
		System.out.println(i5);
		
		String bin2 = Integer.toBinaryString(7);
		System.out.println(bin2);
	}

	private static void imprimir(Object obj) {
		System.out.println(obj);
	}

}
