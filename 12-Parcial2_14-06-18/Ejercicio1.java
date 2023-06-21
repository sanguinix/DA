public class Ejercicio1
{
	public static boolean verificarOrden(int[] arr, int i)
	{
		boolean ordenado = true;
		// Condición: Mientras se itere dentro del rango del arreglo
		if (i < arr.length - 1) {
			if (arr[i] > arr[i + 1]) {
				// CR: Elementos en orden, avanzar una posicion
				ordenado = verificarOrden(arr, i + 1);
			} else {
				// CB: Elementos desordenados, asignar y retornar
				ordenado = false;
			}
		}
		return (ordenado);
	}
	public static void main(String[] args)
	{
		int[] altura = {12, 11, 10, 9, 8, 9};
		System.out.println("¿Elementos ordenados de forma decreciente? : "
				+ verificarOrden(altura, 0));
	}
}
