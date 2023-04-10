import java.util.Scanner;
public class Ejercicio4
{
	/**
	 * Pide al usuario que ingrese las notas de cada alumno.
	 */
	public static double[][] cargarNotas()
	{
		int ALUMNOS = 10;
		int EXAMENES = 6;
		double notasIn[][] = new double[ALUMNOS][EXAMENES];
		Scanner sc = new Scanner(System.in);
		System.out.print("A continuación ingrese las notas " +
				"correspondientes a cada alumno:\n");
		// Sea 'a' un alumno y 'e' un exámen
		for (int a = 0; a < ALUMNOS; a++) {
			System.out.print("Alumno N°" + (a + 1) + ":\n");
			for (int e = 0; e < EXAMENES; e++) {
				System.out.print("\tNota exámen N°" + 
						(e + 1) + ": ");
				notasIn[a][e] = sc.nextDouble();
			}
		}
		return notasIn;
	}
	/**
	 * Calcula el promedio de notas de todos los alumnos.
	 */
	public static double[] calcularPromedio(double[][] notas)
	{
		int ALUMNOS = notas.length;
		int EXAMENES = notas[0].length;
		double promedios[] = new double[ALUMNOS];
		// Sea 'a' un alumno y 'e' un exámen
		for (int a = 0; a < ALUMNOS; a++) {
			double suma = 0;
			for (int e = 0; e < EXAMENES; e++) {
				suma += notas[a][e];
			}
			promedios[a] = suma / EXAMENES;
		}
		return promedios;
	}
	/**
	 * Imprime las notas de los promedios de cada alumno
	 */
	public static void escribirPromedios(double[] promedios)
	{
		int ALUMNOS = promedios.length;
		// Sea 'p' un promedio
		for (int p = 0; p < ALUMNOS; p++) {
			System.out.print("Promedio alumno " + (p + 1) + ": ");
			System.out.print(promedios[p] + ".");
			System.out.print("\n");
		}
	}
	/**
	 * Imprime las notas de cada exámen del alumno 'a'
	 */
	public static void escribirNotas(double notas[][], int alumno)
	{
		int EXAMENES = notas[alumno].length;
		// Sea 'e' la nota de un exámen
		for (int e = 0; e < EXAMENES; e++) {
			System.out.print("\nExámen " + (e + 1) + ": ");
			System.out.print(notas[alumno][e]);
		}
	}
	/**
	 * Busca la mayor nota del último exámen
	 */
	public static double[] buscarMayor(double notas[][])
	{
		double mayor[] = new double[2];
		int ALUMNOS = notas.length;
		mayor[1] = 0;
		for (int i = 0; i < ALUMNOS; i++) {
			if (notas[i][5] > mayor[1]) {
				mayor[0] = i;
				mayor[1] = notas[i][5];
			}
		}
		return mayor;
	}
	/**
	 * Según la opción ingresada, ejecuta el correspondiente módulo.
	 */
	public static void selector(int opcion, double[][] notas)
	{
		Scanner sc = new Scanner(System.in);
		switch (opcion) {
		case 1 :
			escribirPromedios(calcularPromedio(notas));
			break;
		case 2 :
			System.out.print("Ingrese el alumno: ");
			int alumno = sc.nextInt();
			escribirNotas(notas, (alumno - 1));
			break;
		case 3 :
			double mayorNota[] = buscarMayor(notas);
			System.out.print("\nEl alumno que obtuvo mayor nota en" +
					" el último exámen fue el alumno ("+
					((int)mayorNota[0] + 1) +
					") quien sacó un (" +
					mayorNota[1] + ").\n");
			break;
		default:
			System.out.println("¡Opción inválida!");
			System.out.println("Escoja una opción del menú.");
			break;
		}
	}
	/**
	 * Algoritmo principal
	 */
	public static void main(String[] args)
	{
		boolean salir = false;
		int opcionIn;
		Scanner sc = new Scanner(System.in);
		double notas[][] = cargarNotas();
		do {
			System.out.print("\n--------------------------------");
			System.out.print("\n1) Calcular el promedio de todos " +
				"sus alumnos y mostrarlos por pantalla.");
			System.out.print("\n2) Mostrar por pantalla las notas " +
					"del alumno I.");
			System.out.print("\n3) Mostrar por pantalla la mayor " +
				"nota que han sacado los alumnos en el " +
				"último exámen y quien fue el alumno que " +
				"logró esa nota.");
			System.out.print("\n0) Salir.");
			System.out.print("\n--------------------------------");
			System.out.print("\nOpción:");
			opcionIn = sc.nextInt();
			if (opcionIn != 0) {
				selector(opcionIn, notas);
			} else {
				salir = true;
			}
			//if (opcionIn == 0) {
			//	salir = true;
			//}
			//selector(opcionIn, notas);
		} while (!salir);
		System.out.print("\n¡Fin del programa!");
	}
}
