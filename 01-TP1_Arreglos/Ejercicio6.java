import java.util.Scanner;
public class Ejercicio6
{
	/**
	 * Pide al usuario que ingrese una serie de letras, hasta 100 o hasta
	 * que se ingrese un caracter que no sea letra.
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean esLetra = true;
		int i = 0;
		int letrasIngresadas = 0;
		int CANTIDAD_LETRAS = 100; 
		char letras[] = new char[CANTIDAD_LETRAS];
		while (esLetra && i < CANTIDAD_LETRAS) {
			System.out.println("Ingrese una letra: ");
			char letraIn = sc.next().charAt(0);
			esLetra = (letraIn > 64 && letraIn < 91) ||
				(letraIn > 96 && letraIn < 123);
			if (esLetra) {
				letras[i] = letraIn;
				letrasIngresadas++;
			}
			i++;
		}
		// Imprime las letras.
		int j = 0;
		System.out.print("Se han ingresado " + letrasIngresadas +
				" letras:\n");
		while ((j < CANTIDAD_LETRAS) && !(letras[j] == 0)) {
			System.out.print(letras[j] + " ");
			j++;
		}
	}
}
