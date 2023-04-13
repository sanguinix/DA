import misClases.Terreno;
import java.util.Scanner;
public class TestTerreno
{
	// Se crea un objeto global de la clase Scanner
	static Scanner scan = new Scanner(System.in);
	public static void linea()
	{
		System.out.println("\n---------------------------");
	}
	public static Terreno cargarTerreno()
	{
		Terreno terrenoAbuela = new Terreno();
		System.out.print("\nIngresar el código del terreno: ");
		terrenoAbuela.setCodigo(scan.nextInt());
		System.out.print("\nIngresar la manzana del terreno: ");
		terrenoAbuela.setManzana(scan.nextInt());
		System.out.print("\nIngresar la base del terreno (metros): ");
		terrenoAbuela.setBase(scan.nextDouble());
		System.out.print("\nIngresar la altura del terreno (metros): ");
		terrenoAbuela.setAltura(scan.nextDouble());
		return terrenoAbuela;
	}
	public static int menu()
	{
		System.out.print("\n1) Mostrar perímetro del terreno.");
		System.out.print("\n2) Calcular superficie y costo de limpieza.");
		System.out.print("\n3) Calcular valor del terreno.");
		System.out.print("\n0) Salir.");
		linea();
		int opcion = scan.nextInt();
		return opcion;
	}
	public static void main(String[] args)
	{
		boolean salir = false;
		int opcionIn;
		scan = new Scanner(System.in);
		Terreno terrenoAbuelaAida = new Terreno();
		terrenoAbuelaAida = cargarTerreno();
		System.out.println("\nInformación ingresada:");
		System.out.println(terrenoAbuelaAida.toString());
		do {
			System.out.print("\nElija una opción del menú: ");
			linea();
			opcionIn = menu();
			if (opcionIn == 0) {
				salir = true;
			} else {
			switch (opcionIn) {
			case 1 :
				System.out.print("\nPerímetro: " +
						terrenoAbuelaAida.perimetro());
				break;
			case 2 :
				System.out.print(
					"\nEl costo de limpieza para su terreno de " +
					terrenoAbuelaAida.superficie() + " m² es de $" +
					terrenoAbuelaAida.valor(150) + ".");
				break;
			case 3 :
				System.out.print(
					"\nIngrese el valor por metro cuadrado:");
				double precioMetro = scan.nextDouble();
				System.out.print(
					"\nEl Valor del terreno es de $" +
					terrenoAbuelaAida.valor(precioMetro) + ".");
				break;
			default :
				System.out.print("\n¡Opción inválida!\n");
			}
			}
			linea();
		} while (!salir);
		linea();
		System.out.println("\n¡Fin del programa!");
	}
}
