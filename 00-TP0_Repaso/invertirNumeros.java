import java.util.Scanner;
public class invertirNumeros
{
	public static void invertirNum(int numero)
	{
		// Verificar que el número ingresado tenga tres cifras
		if (numero < 100 || numero > 999) {
			System.out.println("El número ingresado no tiene tres cifras.");
			//return; // Salir del programa
		} else {

			// Invertir el número
			int inverso = 0;
			while (numero > 0) {
				inverso = inverso * 10 + numero % 10;
				numero = numero / 10;
			}

			// Imprimir el número invertido
			System.out.println("El número invertido es: " + inverso);
		}
	}
	public static void main(String[] args)
	{
		// Crear objeto Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Pedir al usuario que ingrese un número entero de tres cifras
		System.out.print("Ingrese un número entero de tres cifras: ");
		int numeroIn = sc.nextInt();
		invertirNum(numeroIn);
	}

}
