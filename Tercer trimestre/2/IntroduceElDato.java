package pack1;

import java.util.*;

public class IntroduceElDato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> enteros = new ArrayList<>();
		ArrayList<Double> decimales = new ArrayList<>();
		ArrayList<Boolean> booleanas = new ArrayList<>();
		ArrayList<Character> caracteres = new ArrayList<>();
		ArrayList<String> cadenas = new ArrayList<>();

		while (true) {
			System.out.println("Introduce el dato:");
			String dato = scanner.nextLine();

			try {

				if (isInteger(dato)) {
					enteros.add(Integer.parseInt(dato));
					Collections.sort(enteros);
					System.out.println(enteros);
				} else if (isDouble(dato)) {
					decimales.add(Double.parseDouble(dato));
					Collections.sort(decimales);
					System.out.println(decimales);
				} else if (isBoolean(dato)) {
					booleanas.add(Boolean.parseBoolean(dato));
					Collections.sort(booleanas);
					System.out.println(booleanas);
				} else if (isCharacter(dato)) {
					caracteres.add(dato.charAt(0));
					Collections.sort(caracteres);
					System.out.println(caracteres);
				} else {
					cadenas.add(dato);
					Collections.sort(cadenas);
					System.out.println( cadenas);
				}
			} catch (NumberFormatException e) {
				System.out.println("Error: Introduce un número válido.");
			}
		}


	}

	

	//----------------------------------------------------------------------------
	private static boolean isInteger(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// --------------------------------------------------------------------------
	private static boolean isDouble(String cadena) {
		try {
			Double.parseDouble(cadena);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// ----------------------------------------------------------------------------
	private static boolean isBoolean(String cadena) {
		if(cadena.equals("true") || cadena.equals("false")) {
			return true;
		}else {
			return false;
			}
	}

	// -----------------------------------------------------------------------------
	private static boolean isCharacter(String cadena) {
		if(cadena.length() == 1 && !isInteger(cadena) && !isDouble(cadena) && !isBoolean(cadena)) {
			return true;
		}else {
			return false;
		}
	}

}







