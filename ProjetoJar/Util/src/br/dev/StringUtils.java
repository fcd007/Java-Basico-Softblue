package br.dev;

public class StringUtils {

	public static boolean isEmpty(String string) {
		if (string == null) {
			return true;
		}
		
		return string.trim().length() == 0;
	}
}
