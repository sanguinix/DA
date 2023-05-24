public class Ejercicio4
{
	/**
	 * Recorre todo el número para ver si cada una de sus componentes
	 * son iguales
	 */
	public static boolean iguales(int num)
	{
		boolean igual = false;
		if (num % 10 == num) {
			// Recién en el último número se verifica si es cierto
			igual = true;
		} else if (((num / 10) % 10) != (num % 10)) {
			// Si el anteúltimo y el último número son diferentes
			igual = false;
		} else {
			// Si aún son iguales, entra al paso recursivo :)
			igual = iguales(num / 10);
		}
		return (igual);
	}
	/**
	 * Test con un número arbitrario
	 */
	public static void main(String[] args)
	{
		System.out.println("" + iguales(91999));
	}
}
