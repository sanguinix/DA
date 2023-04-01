import java.util.Scanner;
public class Ejercicio14
{
	/**
	 * Retorna un arreglo bidimensional, en la posición 0 tiene el arreglo
	 * de cadenas que estaban en posiciones pares y en la posición 1 tiene
	 * el arreglo de cadenas que estaban en posiciones impares.
	 */
	public static String[][] separarArreglo(String[] arregloOriginal)
	{
		int LONGITUD_ORIGINAL = arregloOriginal.length;
		int contPares = 0;
		int contImpares = 0;
		// Inicializamos los nuevos arreglos con la mitad de longitud
		// que el original, mas 1, en caso de que la longitud sea impar.
		String cadenasPares[] = new String[LONGITUD_ORIGINAL / 2 + 1];
		String cadenasImpares[] = new String[LONGITUD_ORIGINAL / 2 + 1];
		for (int i = 0; i < LONGITUD_ORIGINAL; i++) {
			if (i % 2 == 0) {
				cadenasPares[contPares] = arregloOriginal[i];
				contPares++;
			} else {
				cadenasImpares[contImpares] = arregloOriginal[i];
				contImpares++;
			}
		}
		String arregloSeparado[][] = {cadenasPares, cadenasImpares};
		return arregloSeparado;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String testCadenas[] = {"alfa", "beta", "gamma", "delta",
					"epsilon", "dseta", "eta", "theta",
					"iota", "kappa", "lambda"};
		String separadas[][] = separarArreglo(testCadenas);
		System.out.print("Las cadenas de las posiciones pares son:\n");
		for (int j = 0; j < separadas[0].length; j++) {
			if (separadas[0][j] != null)
				System.out.print(separadas[0][j] + " ");
		}
		System.out.print("\nLas cadenas de las posiciones impares son:\n");
		for (int k = 0; k < separadas[1].length; k++) {
			if (separadas[1][k] != null)
				System.out.print(separadas[1][k] + " ");
		}
	}
}
