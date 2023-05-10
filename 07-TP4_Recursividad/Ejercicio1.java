public class Ejercicio1
{
	public static int func(int n)
	{
		// Precondición: n es un entero positivo
		int aux;
		if (n == 0)
			aux = 0;
		else
			aux = n + func(n - 1);
		return (aux);
	}
	/**
	 * n |            aux = n + func(n - 1)            | RETORNO
	 * ---------------------------------------------------------
	 * 0 | 0                                           |
	 * 1 | 1 + func(1 - 1) = 1 + func(0) = 1 + 0 = 1   |
	 * 2 | 2 + func(2 - 1) = 2 + func(1) = 2 + 1 = 3   |
	 * 3 | 3 + func(3 - 1) = 3 + func(2) = 3 + 3 = 6   |
	 * 4 | 4 + func(4 - 1) = 4 + func(3) = 4 + 6 = 10  |
	 * 5 | 5 + func(5 - 1) = 5 + func(4) = 5 + 10 = 15 |
	 */
	public static int funcIterativa(int n)
	{
		int aux;
