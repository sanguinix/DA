public class Seleccion
{
	public static void ordenarSeleccion(int[] numeritos)
	{
		int i;
		int j;
		int indiceMenor;
		for (i = 0; i < numeritos.length; i++) {
			indiceMenor = i;
			for (j = i; j < numeritos.length; j++) {
				// Si el número es menor que la punta,
				// o el índice del menor, almacena el índice
				if (numeritos[j] < numeritos[indiceMenor])
					indiceMenor = j;
			}
			intercambiar(numeritos, i, indiceMenor);
		}
	}
	public static void ordenarSeleccionDescendente(int[] numeritos)
	{
		int i;
		int j;
		int indiceMayor;
		for (i = 0; i < numeritos.length; i++) {
			indiceMayor = i;
			for (j = i; j < numeritos.length; j++) {
				// Si el número es mayor que la punta,
				// o el índice del mayor, almacena el índice
				if (numeritos[j] > numeritos[indiceMayor])
					indiceMayor = j;
			}
			intercambiar(numeritos, i, indiceMayor);
		}
	}
	public static void intercambiar(int[] nums, int punta, int nuevaPunta)
	{
		int auxiliar = nums[punta];
		nums[punta] = nums[nuevaPunta];
		nums[nuevaPunta] = auxiliar;
	}
	public static void main(String[] args)
	{
		int i;
		int[] numeros = {7, 6, 11, 17, 3, 15, 5, 19, 30, 14};
		System.out.println("Arreglo desordenado: "
				+ "[7, 6, 11, 17, 3, 15, 5, 19, 30, 14]");
		System.out.println("Arreglo en orden ascendente debe ser: "
				+ "[3, 5, 6, 7, 11, 14, 15, 17, 19, 30]");
		ordenarSeleccion(numeros);
		System.out.print("El algoritmo devuelve: [");
		for (i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		System.out.println("]");
		System.out.println("Arreglo en orden descendente debe ser: "
				+ "[30, 19, 17, 15, 14, 11, 7, 6, 5, 3]");
		ordenarSeleccionDescendente(numeros);
		System.out.print("El algoritmo devuelve: [");
		for (i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		System.out.println("]");
	}
}
