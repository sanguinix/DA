public class Ejercicio3
{
	public static void mistery(int p, String a)
	{
		if (p > 0) {
			System.out.println(a.charAt(p));
			mistery(p - 1, a);
		}
	}
	public static void main(String[] args)
	{
		// Averiguar qué hace ´mistery´
		String numero;
		numero = "123456789";
		int j;
		j = numero.length() - 1;
		mistery(j, numero);
	}
}
/**
 * Traza
 * p | a | PANTALLA
 * ----------------
 * 8 | 123456789 | 9
 * 7 |           | 8
 * 6 |           | 7
 * 5 |           | 6
 * 4 |           | 5
 * 3 |           | 4
 * 2 |           | 3
 * 1 |           | 2
 * 0 |           |
 */
