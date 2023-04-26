package misClases;
public class Persona
{
	/**
	 * Atributos
	 */
	private int documento;
	private String nombre;
	private String apellido;
	/**
	 * Constructores
	 */
	public Persona() {}
	public Persona(int doc, String nom, String ape)
	{
		this.documento = doc;
		this.nombre = nom;
		this.apellido = ape;
	}
	/**
	 * Modificadores
	 */
	public void setDocumento(int doc)
	{
		this.documento = doc;
	}
	public void setNombre(String nom)
	{
		this.nombre = nom;
	}
	public void setApellido(String ape)
	{
		this.apellido = ape;
	}
	/**
	 * Visualizadores
	 */
	public int getDocumento()
	{
		return (this.documento);
	}
	public String getNombre()
	{
		return (this.nombre);
	}
	public String getApellido()
	{
		return (this.apellido);
	}
	public String toString()
	{
		return ("\nDNI: " + this.documento +
			"\nNombre: " + this.nombre +
			"\nApellido: " + this.apellido);
	}
	/**
	 * Métodos propios del tipo
	 */
}
