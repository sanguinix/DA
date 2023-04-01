import java.util.Scanner;
public class Ejercicio4
{
	/**
	 * Retorna el menor de los elementos de un arreglo de tipo double.
	 */
	public static double buscarMenor(double[] numeros)
	{
		double menor = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < menor)
				menor = numeros[i];
		}
		return menor;
	}
	/**
	 * Retorna el mayor de los elementos de un arreglo de tipo double.
	 */
	public static double buscarMayor(double[] numeros)
	{
		double mayor = numeros[0];
		for (int j = 0; j < numeros.length; j++) {
			if (numeros[j] > mayor)
				mayor = numeros[j];
		}
		return mayor;
	}
	/**
	 * Pide al usuario una serie de números y luego muestra el menor y
	 * el mayor número.
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Cuántos números ingresará?\nNúmeros: ");
		int cantidadNumeros = sc.nextInt();
		double listaNumeros[] = new double[cantidadNumeros];
		for (int k = 0; k < cantidadNumeros; k++) {
			System.out.println("Número " + (k + 1) + ": ");
			listaNumeros[k] = sc.nextDouble();
		}
		System.out.println("El número menor es: " + buscarMenor(listaNumeros));
		System.out.println("El número mayor es: " + buscarMayor(listaNumeros));
	}
}
