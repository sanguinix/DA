import misClases.Auto;
import misClases.Persona;
import java.util.Scanner;
public class TestDrive
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		Auto auto_1 = new Auto(2023, 60, 60, 0, "Gris", "Ford",
					"Bronco", "Automática");
		Auto auto_2 = new Auto(2013, 60, 60, 100, "Gris", "Ford",
					"Ranger", "Manual");
		Auto auto_3 = new Auto(2022, 45, 45, 0, "Blanco", "Chevrolet",
					"Corsa", "Manual");
		Auto auto_4 = new Auto(2008, 45, 45, 10000, "Gris", "Volkswagen",
					"Gol", "Manual");
		Auto auto_5 = new Auto(1998, 60, 60, 100, "Blanco", "Ford",
					"F-100", "Manual");
	}
}
