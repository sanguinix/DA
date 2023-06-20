package misClases;
public class Alumno
{
	/**
	 * Atributos
	 */
	private int legajo;
	private int grado;
	private double promedioGeneral;
	private String nombre;
	private String apellido;
	/**
	 * Constructores
	 */
	public Alumno() {}
	public Alumno(String ape, String nom, int leg, int gr, double promGral)
	{
		this.legajo = leg;
		this.grado = gr;
		this.promedioGeneral = promGral;
		this.nombre = nom;
		this.apellido = ape;
	}
	/**
	 * Modificadores
	 */
	public void setGrado(int gr)
	{
		this.grado = gr;
	}
	public void setPromedioGeneral(double promGral)
	{
		this.promedioGeneral = promGral;
	}
	/**
	 * Visualizadores
	 */
	public String getNombre()
	{
		return (this.nombre);
	}
	public int getLegajo()
	{
		return (this.legajo);
	}
	public int getGrado()
	{
		return (this.grado);
	}
	public double getPromedioGeneral()
	{
		return (this.promedioGeneral);
	}
	/**
	 * Propios del Tipo
	 */
	public String toString()
	{
		return ("| Apellido: " + this.apellido
			+ " | Nombre: " + this.nombre
			+ " | Legajo: " + this.legajo
			+ " | Grado: " + this.grado
			+ " | Promedio General: " + this.promedioGeneral
			+ " |");
	}
}
