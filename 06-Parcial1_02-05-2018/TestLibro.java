import misClases.Libro;
import java.util.Scanner;
public class TestLibro
{
	static Scanner scan = new Scanner(System.in);
	public static boolean sinEjemplaresSala(Libro[] libros)
	{
		boolean tieneEjemplar = true;
		int i = 0;
		while (i < libros.length && tieneEjemplar) {
			if (libros[i].getEjemplares() == 0) {
				tieneEjemplares = false;
			} else {
				i++;
			}
		}
		return (tieneEjemplar);
	}
	/**
	 * Calcula si la cantidad de libros sin stock es mayor al 15% del total
	 * libros.length = 100%
	 * limite = 15%
	 */
	public static void renovarStock(Libro[] libros)
	{
		int sinEjemplares = 0;
		double limite = ((15 * libros.length) / 100);
		for (int i = 0; i < libros.length; i++) {
			if (libros[i].getEjemplares() == 0)
				sinEjemplares++;
		}
		if (sinEjemplares > limite)
			System.out.print("\n¡Se debe hacer un nuevo pedido!\n");
	}
	public static void main(String[] args)
	{
		//TODO
		//MENU
	}
