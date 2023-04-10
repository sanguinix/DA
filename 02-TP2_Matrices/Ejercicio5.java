public class Ejercicio5
{
	public static void comprobarMagia(double[][] cuadrado)
	{
		boolean esMagico = false;
		int m = 0;
		int DIMENSION = cuadrado.length;
		double sumaFilas[] = new double[DIMENSION];
		double sumaColumnas[] = new double[DIMENSION];
		double sumaDiagPpal[] = new double[DIMENSION];
		double sumaDiagSecu[] = new double[DIMENSION];
		for (int i = 0; i < DIMENSION; i++) {
			for (int j = 0; j < DIMENSION; j++) {
				sumaFilas[i] += cuadrado[i][j];
				sumaColumnas[j] += cuadrado[i][j];
				//k diagPpal
				//l diagSecu
			}
		}
		while (m < DIMENSION && !esMagico) {
			// Comparar cada suma con la anterior
			if (igual != sumaFilas[m]) {
				esMagico = true;
			}
			m++;
		}
		return esMagico;
		// Test
		for (int k = 0; k < DIMENSION; k++) {
			System.out.print("Suma fila " + k + ":" + sumaFilas[k]);
			System.out.print("\n");
			System.out.print("Suma columna " + k + ":" + sumaColumnas[k]);
			System.out.print("\n------------------\n");
		}
	}
	public static void main(String[] args)
	{
		double testCuadrado[][] = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
		comprobarMagia(testCuadrado);
	}
}
