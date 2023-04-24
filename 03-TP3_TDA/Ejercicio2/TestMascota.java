import misClases.Mascota;
import java.util.Scanner;
public class TestMascota
{
	static Scanner scan = new Scanner(System.in);
	public static void linea()
	{
		System.out.print("--------------------------------");
	}
	public static int menu()
	{
		linea();
		System.out.print("\n1) Mostrar el nombre de la mascota.");
		System.out.print("\n2) Aumentar la edad de la mascota en 1.");
		System.out.print("\n3) Cambiar el peso de la mascota.");
		System.out.print("\n4) Mostrar todos los datos de la mascota.");
		System.out.print("\n0) Salir.\n");
		linea();
		System.out.print("\nOpción: ");
		int opcionIn = scan.nextInt();
		linea();
		return (opcionIn);
	}
	public static void main(String[] args)
	{
		System.out.print("\nIngrese los datos de la mascota:\n");
		linea();
		System.out.print("\nIngrese el código de la mascota: ");
		int codigo = scan.nextInt();
		System.out.print("\nIngrese el nombre de la mascota: ");
		String nombre = scan.next();
		System.out.print("\nIngrese la edad de la mascota: ");
		int edad = scan.nextInt();
		System.out.print("\nIngrese el peso de la mascota: ");
		double peso = scan.nextDouble();
		Mascota mascotita = new Mascota(codigo, nombre, peso, edad);
		boolean salir = false;
		do {
			linea();
			System.out.println("\nIngrese una opción del menú:");
			int opcion = menu();
			switch (opcion) {
			case 0:
				salir = true;
				break;
			case 1 :
				System.out.println("\nNombre: " +
					mascotita.getNombre() + ".");
				break;
			case 2 :
				System.out.println("\nAumentando edad...");
				mascotita.setEdad(mascotita.getEdad() + 1);
				break;
			case 3 :
				System.out.print("\nIngrese el nuevo peso: ");
				mascotita.setPeso(scan.nextDouble());
				break;
			case 4 :
				System.out.println("\nDatos ingresados:\n" +
					mascotita.toString());
				break;
			default :
				System.out.println("\nOpción inválida!");
				System.out.println(
					"\nIngrese una opción del menú:");
				break;
			}
		} while (!salir);
		System.out.println("\nFin del programa!");
	}
}
