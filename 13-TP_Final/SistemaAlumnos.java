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
	 * Imprime una línea divisoria
	 */
	public static void linea()
	{
		System.out.print("\n--------------------------------\n");
	}
	/**
	 * Menú mostrado al inicio del programa
	 */
	public static short mostrarMenu()
	{
		boolean valida = false;
		short opcion;
		do {
			linea();
			System.out.println("\t\tMENU");
			linea();
			System.out.println("1) Cargar información de alumnos");
			System.out.println("2) Pasar de grado a los alumnos");
			System.out.println("3) Ver para un grado, la lista de alumnos "
				+ "ordenada por apellido y nombre en forma ascendente");
			System.out.println("4) Ver los datos de los alumnos egresados "
				+ "ordenados según su promedio en forma descendente");
			System.out.println("5) Ver la cantidad de vacantes del colegio");
			System.out.println("6) Ver para un grado y legajo la posicion "
				+ "en la fila");
			System.out.println("0) Salir");
			linea();
			System.out.println("Ingrese una opción: ");
			opcion = scan.nextShort();
			if ((opcion >= 0) && (opcion <= 6))
				valida = true;
		} while (!valida);
		return (opcion);
	}
	/**
	 * Módulo de creación de objetos `Alumno` y carga de matriz de `Alumno`
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
	 * Asignación de objeto de clase Alumno a una matriz -según grado-
	 */
	public static void asignarAlumno(Alumno[][] alumnos, Alumno alumno)
	{
		boolean libre = false;
		int i = 0;
		int grado = alumno.getGrado();
		while ((i < alumnos[grado - 1].length) && !libre) {
			if (alumnos[grado - 1][i] == null) {
				alumnos[grado - 1][i] = alumno;
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
	 * -Requerida por `main`, no puede ejecutar funciones si no tiene
	 * datos cargados
	 */
	public static boolean verificarMatrizCargada(Alumno[][] unaMatriz)
	{
		boolean tieneValor = false;
		int i = 0;
		int j;
		while (i < unaMatriz.length && !tieneValor) {
			j = 0;
			while (j < unaMatriz[0].length) {
				if (unaMatriz[i][j] != null)
					tieneValor = true;
				j++;
			}
			i++;
		}
		return (tieneValor);
	}
	/**
	 * Intercambia dos posiciones en un arreglo de ENTEROS
	 * -Requerido por `ordenarRepitentes`-
	 */
	public static void intercambiar(int[] arreglo, int indice)
	{
		int auxiliar = arreglo[indice];
		arreglo[indice] = arreglo[indice + 1];
		arreglo[indice + 1] = auxiliar;
	}
	/**
	 * Ordena un arreglo de legajos ENTEROS mediante el algoritmo de
	 * ordenamiento de burbuja mejorado, en orden ascendente
	 * -Requerido por `main`-
	 */
	public static void ordenarRepitentes(int[] legajos)
	{
		boolean ordenado = false;
		int i = legajos.length - 1;
		int j;
		while ((i > 0) && !ordenado) {
			ordenado = true;
			for (j = 0; j < i; j++) {
				if (legajos[j] > legajos[j + 1]) {
					ordenado = false;
					intercambiar(legajos, j);
				}
			}
			i--;
		}
	}
	/**
	 * Busca un alumno en el listado de repitentes y retorna TRUE
	 * si fue encontrado (mediante búsqueda binaria)
	 * -Requerido por `pasarDeGrado`-
	 */
	public static boolean buscarRepitente(int[] repitentes, Alumno unAlumno)
	{
		boolean encontrado = false;
		int inicio = 0;
		int medio;
		int fin = repitentes.length - 1;
		int legajo = unAlumno.getLegajo();
		do {
			medio = (inicio + fin) / 2;
			if (repitentes[medio] == legajo) {
				// `legajo` está justo en el medio
				encontrado = true;
			} else if (repitentes[medio] > legajo) {
				// `legajo` puede estar en el intervalo izquierdo
				fin = medio;
			} else {
				// `legajo` puede estar en el intervalo derecho
				inicio = medio + 1;
			}
		} while (!encontrado && (fin >= inicio));
		return (encontrado);
	}
	/**
	 * Según la existencia de un alumno en el listado de repitentes,
	 * se pasa o no de grado a los alumnos
	 * -Requerido por `main`-
	 */
	public static Alumno[][] pasarDeGrado(Alumno[][] alumnos, int[] repitentes)
	{
		int i;
		int j;
		Alumno[][] actualizados = new Alumno[7][30];
		Alumno[][] egresados = new Alumno[1][30];//FIXME ¿¿Debe ser arreglo??
		for (i = 0; i < alumnos.length; i++) {
			j = 0;
			while ((j < alumnos[0].length) && (alumnos[i][j] != null)) {
				Alumno alumnito = alumnos[i][j];
				if (!buscarRepitente(repitentes, alumnito))
					// Si no es repitente, se promueve
					alumnito.promover();
				if (alumnito.getGrado() == -1) {
					// Si el alumno egresó, se asigna al
					// arreglo de egresados
					asignarAlumno(egresados, alumnito);
				} else {
					// Si no egresó, va al listado ordinario
					asignarAlumno(actualizados, alumnito);
				}
				j++;
			}
		}
		return (actualizados);
		//TODO ¿¿Cómo devuelvo el arreglo de egresados, en una tupla??
	}
	/**
	 * Pide un grado y muestra el listado de alumnos de ese grado en
	 * orden ascendente TODO USAR ORDEN LEXICOGRÁFICO PARA ORDENAR
	 */
	public static void mostrarAlumnosPorGrado(Alumno[][] infoAlumnos)
	{
		boolean valido = false;
		do {
			System.out.print("Ingrese un grado: ");
			linea();
			short grado = scan.nextShort();
			if ((grado >= 1) && (grado <= 7)) {
				valido = true;
				// Muestra el listado
				linea();
				for (int i = 0; i < infoAlumnos[grado].length; i++) {
					if (infoAlumnos[grado][i] != null) {
						System.out.println(infoAlumnos[grado][i].toString());
					}
				}
			} else {
				System.out.println("¡Grado inválido!");
			}
		} while (!valido);
	}
	/**
	 * ALGORITMO PRINCIPAL
	 */
	public static void main(String[] args)
	{
		int opcionIn;
		// Rutas relativas a los ficheros de lectura
		String listaAlumnos = "Data/ListaAlumnos.txt";
		String listaDesaprobados = "Data/ListaDesaprobados.txt";
		int[] legajosRepitentes;//FIXME
		Alumno[][] infoAlumnos;//FIXME
		do {
			// Menú
			opcionIn = mostrarMenu();
			switch (opcionIn) {
			case 1:
				// Cargar datos en las estructuras
				//Alumno[][] infoAlumnos = cargarAlumnos(listaAlumnos);
				//int[] legajosRepitentes = cargarAlumnosDes(listaDesaprobados);
				infoAlumnos = cargarAlumnos(listaAlumnos);
				legajosRepitentes = cargarAlumnosDes(listaDesaprobados);
				// Ordenar el listado de repitentes
				ordenarRepitentes(legajosRepitentes);
				System.out.println("¡Alumnos cargados!");
				break;
			case 2:
				// Pasar de grado
				if (!verificarMatrizCargada(infoAlumnos)) {
					System.out.println("¡Primero debe cargar la información!");
				} else {
					infoAlumnos = pasarDeGrado(infoAlumnos, legajosRepitentes);
					System.out.println("¡Hecho!");
				}
				break;
			case 3:
				// Mostrar la lista de alumnos de un grado
				// ordenada por nombres en forma ascendente
				if (!verificarMatrizCargada(infoAlumnos)) {
					System.out.println("¡Primero debe cargar la información!");
				} else {
					mostrarAlumnosPorGrado(infoAlumnos);
					//TODO
				}
				break;
			case 4:
				if (!verificarMatrizCargada(infoAlumnos)) {
					System.out.println("¡Primero debe cargar la información!");
				} else {
					//TODO
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
	}
}
