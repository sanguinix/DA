import java.util.Scanner;
public class Ejercicio12
{
	/**
	 * Copia los elementos de un arreglo a otro de igual tamaño.
	 */
	public static char[] copiarArreglo(char[] arregloOriginal)
	{
		int longitudArreglo = arregloOriginal.length;
		char arregloCopia[] = new char[longitudArreglo];
		for (int i = 0; i < longitudArreglo; i++)
			arregloCopia[i] = arregloOriginal[i];
		return arregloCopia;
	}
	/**
	 * Pide al usuario que ingrese una serie de caracteres y los carga en
	 * un arreglo de caracteres.
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Cuántos caracteres va a ingresar?\nCantidad: ");
		int cantidadCaracteres = sc.nextInt();
		char caracteres[] = new char[cantidadCaracteres];
		int j = 0;
		while (j < cantidadCaracteres) {
			System.out.println("Ingrese un caracter: ");
			caracteres[j] = sc.next().charAt(0);
			j++;
		}
		char nuevoArreglo[] = copiarArreglo(caracteres);
		// TEST
		for (int k = 0; k < cantidadCaracteres; k++)
			System.out.print(caracteres[k] + " ");
		System.out.println();
		for (int l = 0; l < cantidadCaracteres; l++)
			System.out.print(nuevoArreglo[l] + " ");
	}
}
