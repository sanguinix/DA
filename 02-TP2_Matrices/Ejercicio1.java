import java.util.Scanner;
public class Ejercicio1
{
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
	public static double cargarMatriz()
	{
		int FILAS_IN, COLUMNAS_IN;
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		FILAS_IN = sc.nextInt();
		System.out.print("Columnas: ");
		COLUMNAS_IN = sc.nextInt();
		for (int k = 0; k < FILAS_IN; k++) {
			for (int l = 0; l < FILAS_IN; l++) {
				System.out.print("Columna " + l + ": ");
				matrizIn[k][l] = sc.nextDouble();
	}
	public static void main(String[] args)
	{
		/**
		 * 1) Cargar matriz
		 * 2) Imprimir matriz
		 */
		imprimirMatriz(cargarMatriz());
		// TEST
		double temperaturaEnero[][] = {{30, 28, 40, 29, 29, 32},
						{29.5, 34, 19, 35, 40, 41},
						{25, 30, 13, 39, 47, 44}};
		imprimirMatriz(temperaturaEnero);
	}
}
