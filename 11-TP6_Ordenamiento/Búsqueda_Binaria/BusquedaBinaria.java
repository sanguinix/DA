public class BusquedaBinaria
{
	public static boolean buscarBusquedaBinaria(int[] arr, int buscado)
	{
		boolean encontrado = false;
		int inicio = 0;
		int fin  = arr.length - 1;
		int centro;
		do {
			centro = (inicio + fin) / 2;
			if (arr[centro] == buscado) {
				encontrado = true;
			} else if (arr[centro] > buscado) {
				// `buscado` debe estar en el intervalo izquierdo
				fin = centro;
			} else {
				// `buscado` debe estar en el intervalo derecho
				inicio = centro + 1;
			}
		} while ((!encontrado) && (fin >= inicio));
		return (encontrado);
	}
	public static void main(String[] args)
	{
		int[] notas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("¿Nota encontrada?: "
				+ buscarBusquedaBinaria(notas, 10));
	}
}
