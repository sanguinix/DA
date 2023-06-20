package ejemplos_InOut;
//import java.io.*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Esta clase esta hecha para dar un primer ejemplo rapido de como funcionan
 * algunas clases provistas por Java para el manejo de entrada desde archivos
 * de texto.
 *
 */
public class Ejemplo_1_InOut {

    public static void main(String[] args) {
        /** Para abrir un archivo, tanto en modo lectura como en modo escritura,
         * necesitamos que el archivo exista en el sistema de archivos (en el lugar
         * desde el que lo estamos tratando de abrir).
         * En caso de que el archivo no exista, o que nuestro manejo del archivo
         * provoque fallas, errores, o cualquier tipo de excepción, debemos manejar
         * esas condiciones.
         */


        String nombreArchivoEntrada = "src/ejemplo_InOut/entrada.txt";

	/** Mientras manipulamos archivos de text, será común que operemos con
         * strings que representaran lineas de texto, así que vamos a declarar 
	 * una variable para ir guardando en ella lo que leemos.
         */

        String linea = null;
	int longitud;
	int posicion;

 	try {

            /* FileReader es una clase que como indica el nombre, nos permite
             * leer texto desde un archivo.
             * https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html
             */

            FileReader lectorArchivo = new FileReader(nombreArchivoEntrada);

  

            /* Si bien no es obligatorio, se recomienda fuertemente:
             * Usar buffer para la entrada/salida de un archivo de texto
             * Mejorar la performance de las operaciones de
             * lectura y escritura, pero también es más robusto-
             * https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html
             */

            BufferedReader bufferLectura = new BufferedReader(lectorArchivo);
        

            /* Mientras el buffer de lectura tenga algo por leer desde el archivo,
             * imprimimos cada linea por pantalla y la grabamos tal cual en el archivo.
             */
            while ((linea = bufferLectura.readLine()) != null) {
                System.out.println(linea);
                
		/*o podemos hacer lo que querramos con ese string, por ejemplo
		* obtener su longitud, o verificar si existe un caracter.
		*/

		longitud=linea.length();
		posicion=linea.indexOf(";");
            }

             /* Para evitar que los archivos corran riesgo de quedar corruptos,
             * es conveniente cerrarlos. Cerrando el buffer que envuelve un archivo
             * este se ocupa de cerrar tambien su correspondiente archivo.
             */
            bufferLectura.close();
           
        }
        catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nSignifica que el archivo del "
                    + "que queriamos leer no existe.");
        }
        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }

    }
}