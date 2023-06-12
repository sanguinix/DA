import misClases.TFecha;
import java.util.Scanner;
public class TestFecha
{
	public static TFecha cargaFecha()
	{
		Scanner scan = new Scanner(System.in);
		TFecha laFecha = null;
		int elDia;
		int elMes;
		int elAnio;
		boolean valida = false;
		while (!valida) {
			System.out.print("\nIngrese el día: ");
			elDia = scan.nextInt();
			System.out.print("\nIngrese el mes: ");
			elMes = scan.nextInt();
			System.out.print("\nIngrese el año: ");
			elAnio = scan.nextInt();
			valida = TFecha.esValido(elDia, elMes, elAnio);
			if (valida) {
				laFecha = new TFecha(elDia, elMes, elAnio);
			} else {
				System.out.print("\n¡Fecha inválida!");
			}
		}
		return (laFecha);
	}
	public static void main(String[] args)
	{
		TFecha fechaDelParcial = cargaFecha();
	}
}
