import java.util.Scanner;
public class Ejercicio1
{
	/**
	 * Imprime una matriz tomada por parámetro.
	 */
	public static void imprimirMatriz(double[][] numero)
	{
		int FILAS = numero.length;
		int COLUMNAS = numero[0].length;
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(numero[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	/**
	 * Lee una matriz ingresada por el usuario.
	 */
	public static double[][] cargarMatriz()
	{
		int FILAS_IN, COLUMNAS_IN;
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		FILAS_IN = sc.nextInt();
		System.out.print("Columnas: ");
		COLUMNAS_IN = sc.nextInt();
		double matrizIn[][] = new double[FILAS_IN][COLUMNAS_IN];
		// Sea 'k' el número de fila y 'l' el número de columna
		for (int k = 0; k < FILAS_IN; k++) {
			for (int l = 0; l < FILAS_IN; l++) {
				System.out.print("Elemento  (" + k + ", " +
						l + "): ");
				matrizIn[k][l] = sc.nextDouble();
			}
			System.out.print("\n");
		}
		return matrizIn;
	}
	public static void main(String[] args)
	{
		/**
		 * 1) Cargar matriz
		 * 2) Imprimir matriz
		 */
		imprimirMatriz(cargarMatriz());
	}
}
