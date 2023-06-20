public class Ejercicio4
{
	public static void ordenarBurbujaMejorado(int[] arr)
	{
		boolean ordenado = false;
		int i = arr.length - 1;
		int j;
		while (i > 0 && !ordenado) {
			ordenado = true;
			for (j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					ordenado = false; // Levantar bandera
					intercambiar(arr, j);
				}
			}
			i--;
		}
	}
	public static void intercambiar(int[] arr, int indice)
	{
		int aux = arr[indice];
		arr[indice] = arr[indice + 1];
		arr[indice + 1] = aux;
	}
	public static int[] fusionarArreglos(int[] arr1, int[] arr2)
	{
		int i = 0;
		int j = 0;
		int[] fusion = new int[arr1.length + arr2.length];
		while (i < arr1.length) {
			fusion[i] = arr1[i];
			i++;
		}
		while (j < arr2.length) {
			fusion[i] = arr2[j];
			i++;
			j++;
		}
		ordenarBurbujaMejorado(fusion);
		return(fusion);
	}
	public static void main(String[] args)
	{
		int i;
		int j;
		int[] pesos = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int[] dolares = {29, 28, 27, 26, 25, 24};
		int[] monedas = fusionarArreglos(dolares, pesos);
		System.out.print("Monedas: [");
		for (i = 0; i < monedas.length; i++) {
			System.out.print(monedas[i] + ", ");
		}
		System.out.println("]");
	}
}
