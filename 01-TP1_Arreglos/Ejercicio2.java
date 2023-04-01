import java.util.Scanner;
public class Ejercicio2
{
	/**
	 * Retorna los primeros 10 múltiplos de un número.
	 */
	public static int[] generarMultiplos(int N)
	{
		int multiplosDeN[] = new int[10];
		for (int j = 0; j < 10; j++)
			multiplosDeN[j] = N * (j + 1);
		return multiplosDeN;
	}
	/**
	 * Solicita al usuario un número entero, luego imprime los primeros
	 * 10 múltiplos de ese número.
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numeroIn;
		//int multiplos[] = new int[10];
		System.out.print("Ingrese un número entero 'N': ");
		numeroIn = sc.nextInt();
		int multiplos[] = generarMultiplos(numeroIn);
		System.out.print("Los múltiplos de " + numeroIn + " son: ");
		for (int i = 0; i < 10; i++)
			System.out.print(multiplos[i] + " ");
	}
}
