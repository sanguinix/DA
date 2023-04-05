public class Ejercicio5
{
	public static void comprobarMagia(double[][] cuadrado)
	{
		boolean esMagico;
		int DIMENSION = cuadrado.length;
		double sumaFilas[] = new double[DIMENSION];
		double sumaColumnas[] = new double[DIMENSION];
		for (int i = 0; i < DIMENSION; i++) {
			for (int j = 0; j < DIMENSION; j++) {
				sumaFilas[i] += cuadrado[i][j];
				sumaColumnas[j] += cuadrado[i][j];
			}
		}
		for (int k = 0; k < DIMENSION; k++) {
			System.out.print("Suma fila " + k + ":" + sumaFilas[k]);
			System.out.print("\n");
			System.out.print("Suma columna " + k + ":" + sumaColumnas[k]);
			System.out.print("\n------------------\n");
		}
		//return esMagico;
	}
	public static void main(String[] args)
	{
		double testCuadrado[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
		comprobarMagia(testCuadrado);
	}
}
