public class Ejercicio3
{
	public static String recortarCadenas(String frase)
	{
		int i = 0;
		int espacio;
		String palabra;
		String fraseModificada = "";
		do {
			// Obtener la posición de un espacio desde `i`
			espacio = frase.indexOf(" ", i);
			// Si no se encuentran mas blancos, se ha llegado al final
			if (espacio == -1)
				espacio = frase.length();
			// Obtener la palabra entre el inicio y el espacio
			palabra = frase.substring(i, espacio);
			// Si la longitud de la palabra es mayor, se recorta
			if (palabra.length() > 5)
				palabra = palabra.substring(0, 5) + ".";
			fraseModificada = fraseModificada + palabra + " ";
			// Ahora `i` será el índice del espacio
			i = espacio + 1;
		} while (i <= frase.length());
		return (fraseModificada);
	}
	public static void main(String[] args)
	{
		System.out.println(recortarCadenas("Acuerdo con todos totalmente"));
	}
}
/**
 * frase | i  | espacio | palabra    | fraseModificada
 * -----------------------------------------------------------
 *  (A*) | 0  | 7       | Acuerdo    | -
 *       |    |         | Acuer.     | Acuer. 
 *       | 8  | 11      | con        | Acuer. con 
 *       | 12 | 17      | todos      | Acuer. con todos
 *       | 18 | 27      | totalmente |
 *       |    |         | total.     | Acuer. con todos total.
 * -----------------------------------------------------------
 * (A*) = Acuerdo con todos totalmente
 */
