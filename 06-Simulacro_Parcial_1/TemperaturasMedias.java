import java.util.Scanner;
public class TemperaturasMedias
{
	static Scanner scan = new Scanner(System.in);
	public static void linea()
	{
		System.out.print("\n--------------------------------");
	}
	/**
	 * Lee las temperaturas máximas lo largo de los años registrados
	 * (carga la matriz y la retorna)
	 */
	public static double[][] cargarTemperaturas()
	{
		int AGNOS = 3;
		int MESES = 12;
		double[][] maximasMensuales = new double[AGNOS][MESES];
		// Sea 'i' un año y 'j' un mes
		for (int i = 0; i < AGNOS; i++) {
			System.out.print("\n-- Año " + (i + 1) + " --");
			for (int j = 0; j < MESES; j++) {
				System.out.print("\nIngrese la temperatura " +
						"máxima del mes " + (j + 1) + " : ");
				maximasMensuales[i][j] = scan.nextDouble();
			}
			linea();
		}
		return (maximasMensuales);
	}
	/**
	 * Determina el mes que tuvo el promedio mayor de temperaturas
	 */
	public static int mayorTemperatura(double[][] maximasMensuales)
	{
		int mayor = 0;// Será el número de mes con la mayor temperatura
		double suma;
		double promedio = 0;
		double[] promediosHistoricos = new double[12];
		for (int mes = 0; mes < 12; mes++) {
			suma = 0;
			for (int agno = 0; agno < 3; agno++) {
				suma += maximasMensuales[agno][mes];
			}
			promedio = suma / 3;
			promediosHistoricos[mes] = promedio;
			// Si el promedio del mes actual es mayor al del mes
			// anterior, lo reemplaza
			if (mes > 0) {
				if (promedio > promediosHistoricos[mes - 1]) {
					mayor = mes;
				}
			}
		}
		return (mayor + 1);
	}
	public static void main(String[] args)
	{
		System.out.print("\n\t- TEST -");
		double[][] maximasMensuales = cargarTemperaturas();
		System.out.println("\nMes de mayor temperatura (promedio)");
		System.out.println(mayorTemperatura(maximasMensuales));
	}
}
