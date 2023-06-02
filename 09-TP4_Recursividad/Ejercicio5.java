import java.util.Scanner;
public class Ejercicio5
{
	public static int multiplosDe3(int num)
	{
		// Poner una variable mas que sea la que devuelva
		// la cantidad solo al final
		int multiplos = 0;
		Scanner scan = new Scanner(System.in);
		if (num % 3 == 0) {
			multiplos += 1;
			multiplos = multiplosDe3(num);
		} else if (num == 0) {
			break;
		} else {
			System.out.println("Ingrese un número: ");
			num = scan.nextInt();
			multiplos = multiplosDe3(num);
		}
		return (multiplos);
	}
	public static void main(String[] args)
	{
		System.out.println(multiplosDe3(1));
	}
}
