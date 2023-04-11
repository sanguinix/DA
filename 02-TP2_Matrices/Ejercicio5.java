public class Ejercicio5
{
	public static boolean comprobarMagia(int[][] cuadrado)
	{
		boolean esMagico = true;
		int DIMENSION = cuadrado.length;
		int sumaDiagPpal = 0;
		int sumaDiagSecu = 0;
		// Verificar la suma de las diagonales
		for (int i = 0; i < DIMENSION; i++) {
			sumaDiagPpal += cuadrado[i][i];
		}
		for (int j = DIMENSION - 1; j >= 0; j--) {
			sumaDiagSecu += cuadrado[j][j];
		}
		if (sumaDiagPpal != sumaDiagSecu) {
			return false;
		}
		// Verificar la suma de las filas y columnas
		for (int k = 0; k < DIMENSION; k++) {
			int sumaFila = 0;
			int sumaColumna = 0;
			for (int l = 0; l < DIMENSION; l++) {
				sumaFila += cuadrado[k][l];
				sumaColumna += cuadrado[l][k];
			}
			if (sumaFila != sumaDiagPpal ||
					sumaColumna != sumaDiagPpal) {
				return false;
			}
		}
		return esMagico;
	}
	// TEST
	public static void main(String[] args)
	{
		int testCuadrado[][] = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
		if (comprobarMagia(testCuadrado)) {
			System.out.println("La matriz es un cuadrado mágico!");
		} else {
			System.out.println("La matriz no es un cuadrado mágico");
		}
	}
}
