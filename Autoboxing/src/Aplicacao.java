
public class Aplicacao {
	public static void main(String[] args) {
		Handle h = new Handle();

//		Integer i = Integer.valueOf(10);
//		h.setObj(i);
//		
//		Integer i2 = (Integer) h.getObj();
//		int i3 = i2.intValue();
//		System.out.println(i3);

//		int i = 10;
//		h.setObj(i); // inboxing é aplicado
//		int i2 = (int) h.getObj(); // autoboxing
//		System.out.println(i2);
		
//		Double d1 = Double.valueOf(5);
//		Double d2 = Double.valueOf(4);
		
		//fazendo o autoboxing - double para Double
//		Double d1 = 5.0;
//		Double d2 = 4.0;
//		double d = somar(d1, d2);
//		Double d = somar(d1, d2);
//		System.out.println(d);
		
		//sem o autoboxing
//		Integer i = Integer.valueOf(5);
//		int i2 = i.intValue();
//		i2++;
//		i = Integer.valueOf(i2);
//		System.out.println(i); //exibe 6
		
		//aplicando autoboxing, Wrappers são imutáveis
		Integer i = 5;
		i++;
		System.out.println(i);
	}

//	private static double somar(double d1, double d2) {
//		return d1 + d2;
//	}
}
