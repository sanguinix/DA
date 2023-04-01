public class Ejercicio10
{
	/**
	 * Retorna un arreglo de igual dimensión que el original, pero
	 * invertido.
	 */
	public static int[] invertirArreglo(int[] arregloOriginal)
	{
		int LONGITUD_ARREGLO = arregloOriginal.length;
		int arregloInvertido[] = new int[LONGITUD_ARREGLO];
		int j = LONGITUD_ARREGLO - 1;
		for (int i = 0; i < LONGITUD_ARREGLO; i++) {
			arregloInvertido[i] = arregloOriginal[j];
			j--;
		}
		return arregloInvertido;
	}
	public static void main(String[] args)
	{
		int testNumeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int testInvertidos[] = invertirArreglo(testNumeros);
		for (int k = 0; k < 10; k++)
			System.out.print(testInvertidos[k] + " ");
	}
}
