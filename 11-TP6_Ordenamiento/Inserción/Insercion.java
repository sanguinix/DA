public class Insercion
{
	public static void ordenarInsercion(int[] arreglo)
	{
		int i;
		for (i = 1; i < arreglo.length; i++) {
			reubicar(arreglo, i);
		}
	}
	/**
	 * `posicion` es el indice del primer elemento no ordenado, el cual
	 * queremos insertar
	 * `aux` va a almacenar temporalmente el valor del elemento previo a
	 * insertar
	 * `j` va a ser el indice del elemento anterior al que queremos
	 * insertar
	 */
	public static void reubicar(int[] arr, int posicion)
	{
		int j;
		int aux;
		aux = arr[posicion];
		j = posicion - 1;
		// `j` se moverá de derecha a izquierda
		while (j > 0 && arr[j] > aux) {
			arr[j] = arr[j - 1];
			j--;
		}
		arr[j + 1] = aux;
	}
	public static void main(String[] args)
	{
		int i;
		int[] cartas = {2, 5, 6, 3, 1, 4, 7, 8, 9, 10, 12, 11};
		ordenarInsercion(cartas);
		System.out.print("[");
		for (i = 0; i < cartas.length; i++) {
			System.out.print(cartas[i] + ", ");
		}
		System.out.println("]");
	}
}
