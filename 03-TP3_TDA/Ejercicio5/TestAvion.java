import misClases.Avion;
import java.util.Scanner;
public class TestAvion
{
	static Scanner scan = new Scanner(System.in);
	// TODO Módulo menu();
	public static void main(String[] args)
	{
		boolean salir = false;
		Avion avioncito = new Avion();
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
			default :
				System.out.print("\n¡Opción inválida!\n");
				System.out.print("Ingrese una opción del menú\n");
				break;
		} while (!salir);
		System.out.print("\n¡Fin del Programa!\n");
		}
	}
}
