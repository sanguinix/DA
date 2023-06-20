/**
 * Importación de clases propias y de Java para manejo de archivos
 */
import misClases.Alumno;
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
	public static int mostrarMenu()
	{
		//TODO
		return (opcion);
	}
	public static void cargarMatriz()
	{
		//TODO
	}
	public static void main(String[] args)
	{
		/**
		 * Rutas relativas a los ficheros de lectura
		 */
		String listaAlumnos = "Data/ListaAlumnos.txt";
		String listaDesaprobados = "Data/ListaDesaprobados.txt";
		/**
		 * Variables para trabajar sobre una línea
		 */
		int longitud;
		int posicion;
		String linea = null;
		/**
		 * Manejo de excepciones
		 */
		try {
			// Genérico como en el ejemplo dado
			FileReader lectorArchivo = new FileReader(listaAlumnos);
			BufferedReader bufferLectura = new BufferedReader(lectorArchivo);
			/**
			 * Mientras el buffer de lectura tenga algo por leer
			 * desde el archivo, imprimimos cada linea por
			 * pantalla y la grabamos tal cual en el archivo.
			 */
			linea = bufferLectura.readLine();
			while (linea != null) {
				/**
				 * Ya podemos trabajar con la línea de texto
				 * como una cadena de caracteres, por lo que
				 * podemos usar cualquier método de cadenas
				 */
				System.out.println(linea);
				longitud = linea.length();
				posicion = linea.indexOf(";");
			}
			// Cerrar el buffer de lectura
			bufferLectura.close();
		} catch (FileNotFoundException excepcion) {
			System.err.println(excepcion.getMessage()
			+ "\n¡El archivo que se quiere leer no existe!");
		} catch (IOException excepcion) {
			System.err.println(
				"Error leyendo o escribiendo en el archivo");
		}
	}
}
