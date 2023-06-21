public class Ejercicio3
{
	public static int contar(int num, int cantidad)
	{
		int cant = cantidad;
		if (num % 10 == num) {
			// CB: Solo queda un dígito, asignar y retornar
			if (num == 1 || num == 9) {
				cant += 1;
			} else {
				cant += 0;
			}
		} else if ((num % 10 == 1) || (num % 10 == 9)) {
			// CR: Queda mas de un dígito, verificar y llamar
			cant = contar(num / 10, cant + 1);
		} else {
			cant = contar(num / 10, cant);
		}
		return (cant);
	}
	public static void main(String[] args)
	{
		int numero = 11297100;
		System.out.println("Cantidad de 1 o 9 en el número "
			+ numero + ": " + contar(numero, 0));
	}
}
/*
*	} else if ((num / 10) % 10 == 1 || (num / 10) % 10 == 9) {
*		// CR: Queda mas de un dígito, verificar y llamar
*		cant = contar(num / 10, cant + 1);
*	} else {
*		cant = contar(num / 10, cant);
*	}
*	return (cant);
*/
