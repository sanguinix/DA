import java.util.Scanner;
public class Ejercicio5
{
	static Scanner scan = new Scanner(System.in);
	public static int contarMultiplos()
	{
		int multiplos = 0;
		System.out.println("Ingrese un número entero: ");
		int num = scan.nextInt();
		if (num == 0) {
			multiplos = 0;
		} else if (num % 3 == 0) {
			multiplos = 1 + contarMultiplos();
		} else {
			multiplos = contarMultiplos();
		}
		return (multiplos);
	}
	public static int multiplosDe3(int contadorMultiplos)
	{
		int multiplos = contadorMultiplos;
		System.out.println("Ingrese un número entero: ");
		int num = scan.nextInt();
		if (num == 0) {
			multiplos = multiplos;
		} else if (num % 3 == 0) {
			multiplos = multiplosDe3(multiplos + 1);
		} else {
			multiplos = multiplosDe3(multiplos);
		}
		return (multiplos);
	}
	public static void main(String[] args)
	{
		System.out.println(multiplosDe3(0));
	}
}
