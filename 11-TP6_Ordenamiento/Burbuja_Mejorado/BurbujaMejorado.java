public class BurbujaMejorado
{
	public static void ordenarBurbuja(int[] numeritos)
	{
		boolean ordenado = false;
		int i = numeritos.length - 1;
		int j;
		while ((i > 0) && !ordenado) {
			ordenado = true;
			for (j = 0; j < i; j++) {
				if (numeritos[j] > numeritos[j + 1]) {
					ordenado = false;
					intercambiar(numeritos, j);
				}
			}
			i--;
		}
	}
	public static void ordenarBurbujaDescendente(int[] numeritos)
	{
		boolean ordenado = false;
		int i = numeritos.length - 1;
		int j;
		while ((i > 0) && !ordenado) {
			for (j = 0; j < i; j++) {
				if (numeritos[j] < numeritos[j + 1]) {
					ordenado = false;
					intercambiar(numeritos, j);
				}
			}
			i--;
		}
	}
	public static void intercambiar(int[] nums, int indice)
	{
		int auxiliar = nums[indice];
		nums[indice] = nums[indice + 1];
		nums[indice + 1] = auxiliar;
	}
	public static void main(String[] args)
	{
		int i;
		int[] numeros = {89, 45, 68, 90, 29, 34, 17};
		System.out.println(
			"Arreglo desordenado: [89, 45, 68, 90, 29, 34, 17]");
		System.out.println("Arreglo en orden ascendente debe ser: "
				+ "[17, 29, 34, 45, 68, 89, 90]");
		ordenarBurbuja(numeros);
		System.out.print("El algoritmo devuelve: [");
		for (i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		System.out.println("]");
		System.out.println("Arreglo en orden descendente debe ser: "
				+ "[90, 89, 68, 45, 34, 29, 17]");
		ordenarBurbujaDescendente(numeros);
		System.out.print("El algoritmo devuelve: [");
		for (i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		System.out.println("]");
	}
}
