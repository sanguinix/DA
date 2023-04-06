import misClases.Terreno;
import java.util.Scanner;
public class TestTerreno
{
	public static Terreno cargarTerreno() {
		Scanner sc = new Scanner(System.in);
		Terreno terrenoAbuela = new Terreno();
		System.out.print("\nIngresar el código del terreno: ");
		terrenoAbuela.setCodigo(sc.nextInt());
		System.out.print("\nIngresar la manzana del terreno: ");
		terrenoAbuela.setManzana(sc.nextInt());
		System.out.print("\nIngresar la base del terreno (metros): ");
		terrenoAbuela.setBase(sc.nextDouble());
		System.out.print("\nIngresar la altura del terreno (metros): ");
		terrenoAbuela.setAltura(sc.nextDouble());
		return terrenoAbuela;
	}
	public static void menu()
	{
		System.out.print("\n1) Mostrar perímetro del terreno.");
		System.out.print("\n2) Calcular superficie y costo de limpieza.");
		System.out.print("\n3) Calcular valor del terreno.");
		System.out.print("\n0) Salir.");
	}
	public static void selector(int opcion)
	{
		switch (opcion) {
		case 1 :
			System.out.println("::TESTING...");
			//mostrarPerímetro();
			break;
		case 2 :
			System.out.println("::TESTING...");
			//calcularSuperficie();
			break;
		case 3 :
			System.out.println("::TESTING...");
			//calcularValor();
			break;
		default :
			System.out.print("\n¡Opción inválida!\n");
		}
	}
	public static void main(String[] args)
	{
		boolean salir = false;
		int opcionIn;
		Scanner sc = new Scanner(System.in);
		Terreno terrenoAbuelaAida = new Terreno();
		terrenoAbuelaAida = cargarTerreno();
		System.out.println("\nInformación ingresada:");
		System.out.println(terrenoAbuelaAida.toString());
		do {
			System.out.print("\nElija una opción del menú: ");
			System.out.print("\n---------------------------");
			menu();
			System.out.println("\n---------------------------");
			opcionIn = sc.nextInt();
			if (opcionIn == 0) {
				salir = true;
			} else {
				selector(opcionIn);
			}
		} while (!salir);
		System.out.print("\n---------------------------");
		System.out.println("\n¡Fin del programa!");
	}
}
