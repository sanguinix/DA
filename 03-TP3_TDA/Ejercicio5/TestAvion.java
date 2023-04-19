import misClases.Avion;
import java.util.Scanner;
public class TestAvion
{
	static Scanner scan = new Scanner(System.in);
	public static void linea()
	{
		System.out.print("\n----------------------------------");
	}
	public static int menu()
	{
		linea();
		System.out.print("\n\t\tMENU");
		linea();
		System.out.print("\n1) Modificar identificador");
		System.out.print("\n2) Modificar modelo");
		System.out.print("\n3) Modificar cantidad de asientos");
		System.out.print("\n4) Modificar kilómetros recorridos");
		System.out.print("\n5) Modificar velocidad promedio");
		System.out.print("\n6) Ver datos cargados del avión");
		System.out.print("\n0) Salir");
		linea();
		System.out.print("\nOpción:");
		return (scan.nextInt());
	}
	public static Avion cargarAvion()
	{
		Avion avioncito = new Avion();
		linea();
		System.out.print("\n\tRegistro de Avión");
		linea();
		System.out.print("\nIngresar identificador: ");
		avioncito.setIdentificador(scan.nextInt());
		System.out.print("\nIngresar modelo: ");
		avioncito.setModelo(scan.next());
		System.out.print("\nIngresar cantidad de asientos: ");
		avioncito.setCantidadAsientos(scan.nextInt());
		System.out.print("\nIngresar kilómetros recorridos: ");
		avioncito.setKmRecorridos(scan.nextDouble());
		System.out.print("\nIngresar velocidad promedio: ");
		avioncito.setVelocidadPromedio(scan.nextDouble());
		return (avioncito);
	}
	public static void main(String[] args)
	{
		boolean salir = false;
		Avion avioncito = cargarAvion();
		do {
			int opcion = menu();
			switch (opcion) {
			case 0 :
				salir = true;
				break;
			case 1 :
				System.out.println("\nIdentificador: ");
				avioncito.setIdentificador(scan.nextInt());
				break;
			case 2 :
				System.out.println("\nModelo: ");
				avioncito.setModelo(scan.next());
				break;
			case 3 :
				System.out.println("\nCantidad de asientos: ");
				avioncito.setCantidadAsientos(scan.nextInt());
				break;
			case 4 :
				System.out.println("\nKilómetros recorridos: ");
				avioncito.setKmRecorridos(scan.nextDouble());
				break;
			case 5 :
				System.out.println("\nVelocidad promedio: ");
				avioncito.setVelocidadPromedio(scan.nextDouble());
				break;
			case 6 :
				linea();
				System.out.println("\n\tDatos del avión");
				linea();
				System.out.println(avioncito.toString());
				break;
			default :
				System.out.print("\n¡Opción inválida!\n");
				System.out.print("Ingrese una opción del menú\n");
				break;
			}
		} while (!salir);
		System.out.print("\n¡Fin del Programa!\n");
	}
}
