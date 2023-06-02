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
	public static int funcIterativa(int n)
	{
		int aux;
	}
	public static void main(String[] args) {
		System.out.println(func(10));
	}
}
/**
 * Traza Apilado
 * n  | aux          | RETORNO
 * ------------------------
 * 10 | 10 + func(9) |
 * 9  | 9 + func(8)  |
 * 8  | 8 + func(7)  |
 * 7  | 7 + func(6)  |
 * 6  | 6 + func(5)  |
 * 5  | 5 + func(4)  |
 * 4  | 4 + func(3)  |
 * 3  | 3 + func(2)  |
 * 2  | 2 + func(1)  |
 * 1  | 1 + func(0)  |
 * 0  | 0            | 0
 * 
 * Traza Desapilado
 * n  | aux | RETORNO
 * ------------------
 * 0  | 0   | 0
 * 1  | 1   | 1
 * 2  | 3   | 3
 * 3  | 6   | 6
 * 4  | 10  | 10
 * 5  | 15  | 15
 * 6  | 21  | 21
 * 7  | 28  | 28
 * 8  | 36  | 36
 * 9  | 45  | 45
 * 10 | 55  | 55
 */
