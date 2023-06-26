/**
 * Importación de clases propias y de Java para manejo de archivos
 */
import misClases.Alumno;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class SistemaAlumnos
{
	/**
	 * Objeto "Scanner" global, se usará en varios módulos
	 */
	static Scanner scan = new Scanner(System.in);
	/**
	 * Menú mostrado al inicio del programa
	 */
	public static int mostrarMenu()
	{
		int opcion;
		System.out.println("--------------------------------");
		System.out.println("              MENU");
		System.out.println("--------------------------------");
		System.out.println("1) Cargar información de alumnos");
		System.out.println("2) Pasar de grado a los alumnos");
		System.out.println("3) Ver para un grado, la lista de alumnos "
			+ "ordenada por apellido y nombre en forma ascendente");
		System.out.println("4) Ver los datos de los alumnos egresados "
			+ "ordenados según su promedio en forma descendente");
		System.out.println("5) Ver la cantidad de vacantes del colegio");
		System.out.println("6) Ver para un grado y legajo la posicion "
			+ "en la fila");
		System.out.println("0) Salir
		System.out.println("--------------------------------");
		System.out.println("Ingrese una opción: ");
		opcion = scan.nextInt();
		return (opcion);
	}
	/**
	 * Módulo de creación de objetos `Alumno`  y carga de matriz de Alumnos
	 */
	public static Alumno[][] cargarAlumnos(String listaAlumnos)
	{
		/**
		 * Variables para trabajar sobre una línea
		 */
		int inicio;
		int fin;
		String linea = null;
		Alumno[][] infoAlumnos = new Alumno[7][30];
		/**
		 * Manejo de excepciones verificadas
		 */
		try {
			FileReader lectorArchivo = new FileReader(listaAlumnos);
			BufferedReader bufferLectura = new BufferedReader(lectorArchivo);
			/**
			 * Mientras el buffer de lectura tenga algo por leer
			 * desde el archivo, imprimimos cada linea por
			 * pantalla y la grabamos tal cual en el archivo.
			 */
			while ((linea = bufferLectura.readLine()) != null) {
				/**
				 * `inicio` y `fin` se van actualizando para
				 * obtener los valores requeridos
				 */
				inicio = 0;
				fin = linea.indexOf(";");
				Alumno alumnito;
				// Leer apellido
				String apellido = linea.substring(inicio, fin);
				inicio = fin + 1;
				fin = linea.indexOf(";", inicio);
				// Leer nombre
				String nombre = linea.substring(inicio, fin);
				inicio = fin + 1;
				fin = linea.indexOf(";", inicio);
				// Leer legajo
				int legajo = Integer.parseInt(linea.substring(inicio, fin));
				inicio = fin + 1;
				fin = linea.indexOf(";", inicio);
				// Leer grado
				int grado = Integer.parseInt(linea.substring(inicio, fin));
				inicio = fin + 1;
				// Leer promedio
				int promedio = Integer.parseInt(linea.substring(inicio));
				// Crear el objeto alumno con los datos leidos
				alumnito = new Alumno(apellido,nombre, legajo, grado, promedio);
				// Asigna el alumno a la matriz
				asignarAlumno(infoAlumnos, alumnito);
			}
			// Cerrar el buffer de lectura
			bufferLectura.close();
		} catch (FileNotFoundException excepcion) {
			System.err.println(excepcion.getMessage()
			+ "\n¡El archivo que se quiere leer no existe!");
		} catch (IOException excepcion) {
			System.err.println(
			"\nError leyendo o escribiendo en el archivo");
		}
		return (infoAlumnos);
	}
	/**
	 * Módulo de asignación de objeto alumno a una matriz -según grado-
	 */
	public static void asignarAlumno(Alumno[][] infoAlum, Alumno alum)
	{
		boolean libre = false;
		int i = 0;
		int grado = alum.getGrado();
		while (i < infoAlum[grado - 1].length && !libre) {
			if (infoAlum[grado - 1][i] == null) {
				infoAlum[grado - 1][i] = alum;
				libre = true;
			}
			i++;
		}
	}
	/**
	 * Módulo de carga de arreglo de legajos de alumnos desaprobados
	 */
	public static int[] cargarAlumnosDes(String listaDesaprobados)
	{
		/**
		 * Variables para trabajar sobre una línea
		 */
		int i = 0; // Va a ser el contador de posiciones
		int[] desaprobados = new int[100];
		String linea = null;
		/**
		 * Manejo de excepciones verificadas
		 */
		try {
			FileReader lectorArchivo = new FileReader(listaDesaprobados);
			BufferedReader bufferLectura = new BufferedReader(lectorArchivo);
			/**
			 * Mientras el buffer de lectura tenga algo por leer
			 * desde el archivo, lee la línea
			 */
			while ((linea = bufferLectura.readLine()) != null) {
				desaprobados[i] = Integer.parseInt(linea);
				i++;
			}
			// Cerrar el buffer de lectura
			bufferLectura.close();
		} catch (FileNotFoundException excepcion) {
			System.err.println(excepcion.getMessage()
			+ "\n¡El archivo que se quiere leer no existe!");
		} catch (IOException excepcion) {
			System.err.println(
			"\nError leyendo o escribiendo en el archivo");
		}
		return (desaprobados);
	}
	/**
	 * Retorna true si la matriz tiene algún valor cargado
	 */
	public static boolean verificarMatrizCargada(Alumno[][] unaMatriz)
	{
		boolean tieneValor = false;
		int i;
		int j;
		while (i < unaMatriz.length && !tieneValor) {
			while (j < unaMatriz[0].length) {
				if (unaMatriz[i][j] != null)
					tieneValor = true;
			}
		}
		return (tieneValor);
	}
	/**
	 * Busca un alumno en el listado de repitentes y retorna
	 * true si fue encontrado (mediante búsqueda binaria)
	 */
	public static boolean buscarRepitente(Alumno unAlumno, Alumno[] repitentes)
	{
		boolean encontrado = false;
		int inicio = 0;
		int medio;
		int fin = repitentes.length - 1;
		int legajo = unAlumno.getLegajo();
		do {
			medio = (inicio + fin) / 2;
			if (repitentes[medio] == legajo) {
				encontrado = true;
			} else if (repitentes[medio] > legajo) {
			// `legajo` debe estar en el intervalo izquierdo
				fin = medio;
			} else {
			// `legajo` debe estar en el intervalo derecho
				inicio = medio + 1;
			}
		} while (!encontrado && (fin >= inicio));
		return (encontrado);
	}
	/**
	 * Según el promedio, se pasa o no de grado a los alumnos
	 */
	public static Alumno[][] pasarDeGrado(Alumno[][] alumnos, Alumno[] repitentes)
	{
		int i;
		int j;
		Alumno[][] actualizados = new Alumno[7][30];
		for (i = 0; i < alumnos.length; i++) {
			while (j < alumnos[0].length && (alumnos[i][j] != null)) {
				Alumno alumnito = alumnos[i][j];
				if (buscarRepitente(alumnito);
	}
	public static void main(String[] args)
	{
		// Rutas relativas a los ficheros de lectura
		String listaAlumnos = "Data/ListaAlumnos.txt";
		String listaDesaprobados = "Data/ListaDesaprobados.txt";
		do {
			// Menú
			int opcionIn = mostrarMenu();
			switch (opcionIn) {
			case 1:
				Alumno[][] infoAlumnos = cargarAlumnos(listaAlumnos);
				int[] legajosRepitentes = cargarAlumnosDes(listaDesaprobados);
				System.out.println("¡Alumnos cargados!");
				break;
			case 2:
				if (!verificarMatrizCargada(infoAlumnos)) {
					System.out.println("¡Primero debe cargar la información!");
				} else {
					infoAlumnos = pasarDeGrado(infoAlumnos, legajosRepitentes);
				}
				break;
			case 3:
				if (!verificarMatrizCargada(infoAlumnos)) {
					System.out.println("¡Primero debe cargar la información!");
				} else {
					pasarDeGrado();
				}
				break;
			case 4:
				if (!verificarMatrizCargada(infoAlumnos)) {
					System.out.println("¡Primero debe cargar la información!");
				} else {
					pasarDeGrado();
				}
				break;
			case 5:
				//TODO
				break;
			case 6:
				//TODO
				break;
			}
		} while (opcionIn != 0);
		//////// TEST ////////
		System.out.println("TEST...XD");
		for (int i = 0; i < legajosRepitentes.length; i++) {
			System.out.println(legajosRepitentes[i]);
		}
		System.out.println("TEST...XD");
		for (int j = 0; j < infoAlumnos.length; j++) {
			System.out.println("----------------------------");
			System.out.println("----------------------------");
			for (int k = 0; k < infoAlumnos[j].length; k++) {
				if (infoAlumnos[j][k] != null) {
					System.out.println(infoAlumnos[j][k].toString());
				}
				System.out.println("----------------------------");
			}
		}
	}
}
/**
 * Módulo recursivo para leer un fichero
 */
//public static String leerLinea(String nombreArchivo, int numeroLinea)
//	throws IOException
//{
//	//TODO
//}
