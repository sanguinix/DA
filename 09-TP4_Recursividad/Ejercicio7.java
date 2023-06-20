public class Ejercicio7
{
	/**
	 * Retorna la suma de cada fila
	 */
	public static int[] sumarFilas1(int[][] matriz, int i, int j, int[] sumaF)
	{
		int[] sumaFila = sumaF;
		// CR: Mientras se itere dentro del rango de la matriz 
		if (i < matriz.length) {
			if (j < matriz[0].length) {
				sumaFila[i] += matriz[i][j];
				j++;
				sumarFilas1(matriz, i, j, sumaFila);
			} else {
				i++;
				sumarFilas1(matriz, i, 0, sumaFila);
			}
		}
		// CB: Cuando se supera el rango de la matriz
		return (sumaFila);
	}
	/**
	 * Escribe la suma de cada fila
	 */
	public static void sumarFilas(int[][] matriz, int i, int j, int sumaF)
	{
		int sumaFila = sumaF;
		if (i < matriz.length) {
			if (j < matriz[0].length) {
				sumaFila += matriz[i][j];
				j++;
				sumarFilas(matriz, i, j, sumaFila);
			} else {
				System.out.println("La suma de los elementos de la fila "
						+ i + " es: " + sumaFila);
				i++;
				sumarFilas(matriz, i, 0, 0);
			}
		}
	}
	public static void main(String[] args)
	{
		int[][] notas = {
			{1, 2, 3, 4, 5},
			{5, 4, 3, 2, 1},
			{1, 1, 1, 1, 1},
			{0, 0, 0, 0, 0}
		};
		int[] suma = new int[notas.length];
		sumarFilas1(notas, 0, 0, suma);
		for (int i = 0; i < suma.length; i++) {
			System.out.println("Suma fila 1: " + suma[i]);
		}
	}
}
