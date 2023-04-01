import java.util.Scanner;
public class numerosDiv
{
	public static boolean esDivisible(int dividendo, int divisor) {
		return dividendo % divisor == 0;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Ingrese número A: ");
		a = sc.next();
		System.out.println("Ingrese número B: ");
		b = sc.next();
		System.out.println("Ingrese número C: ");
		c = sc.next();
		if (esDivisible(a, c) && esDivisible(b, c)) {
			System.out.println("Los números A y B son divisibles por C");
		}
		else if (esDivisible(a, c) && (esDivisible(b, c) == False)) {
			System.out.println("Solo el número A es divisible por C");
		}
		else if ((esDivisible(a, c) == false) && esDivisible(b, c)) {
			System.out.println("Solo el número B es divisible por C");
		} else {
			System.out.println("Ni A ni B son divisibles por C");
		}
	}
}
