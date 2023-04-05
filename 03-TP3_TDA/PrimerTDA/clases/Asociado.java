public class Asociado
{
	/**
	 * Variables de instancia
	 */
	private boolean premium;
	private int nroSocio;
	private int cuotasImpagas;
	private String nombre;
	private String apellido;
	/**
	 * Constructor
	 */
	public Asociado()
	{
	}
	/**
	 * Interfaz
	 */
	// Observadores
	
	// Modificadores
	public boolean getPremium()
	{
		return this.premium;
	}
	public int getNroSocio()
	{
		return this.nroSocio;
	}
	public int getCuotasImpagas()
	{
		return this.cuotasImpagas;
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public String getApellido()
	{
		return this.apellido;
	}
}
