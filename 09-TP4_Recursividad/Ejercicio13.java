public class Ejercicio13
{
	public static int buscarMayor(int[][] matriz, int fila, int columna, int maximo)
	{
		// Caso base: cuando se alcanza el final de la matriz
		int maximoReal;
		if (fila == matriz.length) {
			maximoReal = maximo;
		} else {
			// Actualiza el máximo si el elemento actual es mayor
			if (matriz[fila][columna] > maximo) {
				maximo = matriz[fila][columna];
			}
			// Avanza a la siguiente columna o fila
			if (columna < matriz[fila].length - 1) {
				maximoReal = buscarMayor(matriz, fila, columna + 1, maximo);
			} else {
				maximoReal = buscarMayor(matriz, fila + 1, 0, maximo);
			}
		}
		return (maximoReal);
	}
	public static void main(String[] args)
	{
		int[][] matrizTest = {{1, 2, 10}, {4, 5, 6}, {7, 8, 9}};
		int mayorValor = buscarMayor(matrizTest, 0, 0, -99999);
		System.out.println("El mayor elemento de la matriz es: " + mayorValor);
	}
}
