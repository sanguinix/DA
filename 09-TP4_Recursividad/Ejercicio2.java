public class Ejercicio2
{
	public static int algo(int n)
	{
		//precondición: n es un entero positivo
		int aux;
		if (n == 1) {
			aux = 1;
		} else {
			aux = algo(n - 1) + 1;
		}
		return (aux);
		}
	public static void main(String[] args)
	{
		System.out.println(algo(5));
	}
}
/**
 * Traza Apilado
 * n | aux         | RETORNO
 * -------------------------
 * 5 | algo(4) + 1 |
 * 4 | algo(3) + 1 |
 * 3 | algo(2) + 1 |
 * 2 | algo(1) + 1 |
 * 1 | 1           | 1
 *
 * Traza Desapilado
 * n | aux | RETORNO
 * -----------------
 * 1 | 1   | 1
 * 2 | 2   | 2
 * 3 | 3   | 3
 * 4 | 4   | 4
 * 5 | 5   | 5
 */
