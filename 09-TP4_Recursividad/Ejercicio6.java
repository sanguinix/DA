public class Ejercicio6
{
	/**
	 * CB: Si `i` se pasa de la longitud del arreglo, se retorna el mayor
	 * CR: Mientras `i` sea menor que la longitud del arreglo, se busca
	 * el menor valor en los elementos y se va pasando por parámetro
	 */
	public static int mayor(int[] arr, int i, int mayorNumero)
	{
		int mayorNum = mayorNumero;
		if (i < arr.length) {
			if (arr[i] > mayorNum)
				mayorNum = arr[i];
			mayorNum = mayor(arr, i + 1, mayorNum);
		}
		return (mayorNum);
	}
	public static void main(String[] args)
	{
		int[] numeros = {1, 3, 1, 7, 8, 9};
		System.out.println(mayor(numeros, 0, -9999));
	}
}
